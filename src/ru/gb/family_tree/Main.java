package ru.gb.family_tree;

import ru.gb.family_tree.family_tree.FamilyTree;
import ru.gb.family_tree.human.Gender;
import ru.gb.family_tree.human.Human;
import ru.gb.family_tree.save.FileHandler;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        String filePath = "src/ru/gb/vending_machine/tree.txt";
        FamilyTree tree = testTree();
//        FamilyTree tree = load(filePath);
        System.out.println(tree);

        save(tree, filePath);
    }

    private static FamilyTree load(String filePath) {
        Writable writable = new FileHandler();
        return (FamilyTree) writable.read(filePath);
    }

    private static void save(FamilyTree tree, String filePath){
        Writable writable = new FileHandler();
        writable.save(tree, filePath);
    }

    private static FamilyTree testTree(){
        FamilyTree tree = new FamilyTree();

        Human gena = new Human("Геннадий", Gender.Male, LocalDate.of(1977, 11, 27));
        Human luda = new Human("Людмила", Gender.Female, LocalDate.of(1975, 8,18));

        tree.add(gena);
        tree.add(luda);
        tree.setWedding(gena.getId(), luda.getId());

        Human masha = new Human("Мария", Gender.Female, LocalDate.of(1997, 6, 28),
                gena, luda);
        Human danil = new Human("Даниил", Gender.Male, LocalDate.of(2000, 10, 1),
                gena, luda);

        tree.add(masha);
        tree.add(danil);

        return tree;
    }
}
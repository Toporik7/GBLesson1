package ru.gb.family_tree.family_tree;

import ru.gb.family_tree.family_tree.model.save.FamilyTreeService;
import ru.gb.family_tree.family_tree.model.familyTree.FamilyTree;
import ru.gb.family_tree.family_tree.model.human.Gender;
import ru.gb.family_tree.family_tree.model.human.Human;
import ru.gb.family_tree.family_tree.model.save.base.FileHandlerForFamilyTree;
import ru.gb.family_tree.family_tree.view.Console;
import ru.gb.family_tree.family_tree.view.View;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        FamilyTree<Human> tree = new FamilyTree<>();

        Human gena = new Human("Геннадий", Gender.Male, LocalDate.of(1977, 11, 27));
        Human luda = new Human("Людмила", Gender.Female, LocalDate.of(1975, 8,18));

        tree.add(gena);
        tree.add(luda);

        System.out.println(tree);

        FamilyTreeService service = new FamilyTreeService(tree);
        service.setWritable(new FileHandlerForFamilyTree());
        service.save();

        View view = new Console();
        view.start();
    }
}
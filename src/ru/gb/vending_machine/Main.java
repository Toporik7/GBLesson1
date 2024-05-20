package ru.gb.vending_machine;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
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

        System.out.println(tree);
    }
}
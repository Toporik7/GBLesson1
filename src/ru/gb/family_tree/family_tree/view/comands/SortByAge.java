package ru.gb.family_tree.family_tree.view.comands;

import ru.gb.family_tree.family_tree.view.Console;

public class SortByAge extends Command{

    public SortByAge(Console console) {
        super("Сортировать список по возрасту", console);
    }

    @Override
    public void execute(){
        getConsoleUI().sortByAge();
    }
}

package ru.gb.family_tree.family_tree.view.comands;

import ru.gb.family_tree.family_tree.view.Console;

public class SortByName extends Command{

    public SortByName(Console console) {
        super("Сортировать список по имени", console);
    }

    @Override
    public void execute(){
        getConsoleUI().sortByName();
    }
}

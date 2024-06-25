package ru.gb.family_tree.family_tree.view.comands;

import ru.gb.family_tree.family_tree.view.Console;

public class AddRelationships {
    public AddRelationships(Console consoleUI) {
        super("Добавить родственную связь", console);
    }

    @Override
    public void execute(){
        getConsole().addRelationship();
    }
}

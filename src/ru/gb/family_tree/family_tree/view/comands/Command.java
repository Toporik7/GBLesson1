package ru.gb.family_tree.family_tree.view.comands;

import ru.gb.family_tree.family_tree.view.Console;

public class Command {
    private String description;
    private Console consoleUI;

    public Command(String description, Console consoleUI) {
        this.description = description;
        this.consoleUI = consoleUI;
    }

    public String getDescription(){
        return description;
    }

    Console getConsoleUI() {
        return consoleUI;
    }

    public abstract void execute();
}

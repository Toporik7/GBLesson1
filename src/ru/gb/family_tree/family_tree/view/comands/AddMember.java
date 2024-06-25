package ru.gb.family_tree.family_tree.view.comands;

import ru.gb.family_tree.family_tree.view.Console;

public class AddMember extends Command{

    public AddMember(Console consoleUI) {
        super("Добавить члена", consoleUI);
    }

    @Override
    public void execute(){
        getConsole().addMember();
    }
}

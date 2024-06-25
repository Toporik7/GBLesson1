package ru.gb.family_tree.family_tree.view.comands;

import ru.gb.family_tree.family_tree.view.Console;

public class RemoveMember extends Command{

    public RemoveMember(Console console) {
        super("Удалить члена", console);
    }

    @Override
    public void execute(){
        getConsoleUI().removeMemeber();
    }
}

package ru.gb.family_tree.family_tree.view.comands;

import ru.gb.family_tree.family_tree.view.Console;

public class EndProgram extends Command{

    public EndProgram(Console console) {
        super("Закончить работу", console);
    }

    @Override
    public void execute(){
        getConsole().endProgram();
    }
}

package ru.gb.family_tree.family_tree.view.comands;

import ru.gb.family_tree.family_tree.view.Console;

public class GetMemberList extends Command{

    public GetMemberList(Console console) {
        super("Вывести список всех членов", console);
    }

    @Override
    public void execute(){
        getConsoleUI().getMemberList();
    }
}

package ru.gb.family_tree.family_tree.view;

import ru.gb.family_tree.family_tree.presenter.Presenter;


import java.util.Scanner;

public class Console implements View{
    private final Scanner scanner;
    private final Presenter presenter;
    private boolean work;
    private final Menu Menu;

    public Console() {
        scanner = new Scanner(System.in);
        presenter = new Presenter(this);
        work = true;
        Menu = new Menu(this);
    }

    public Console(Scanner scanner, Presenter presenter, ru.gb.family_tree.family_tree.view.Menu menu) {
        this.scanner = scanner;
        this.presenter = presenter;
        Menu = menu;
    }

    @Override
    public void start() {
        while (work) {
            System.out.println("Добро пожаловать!\n");
            System.out.println(Menu.menu());
            String choiceStr = scanner.nextLine();
            if (choiceStr.isEmpty()) {
                System.out.println("Ошибка: Введена пустая команда");
                break;
            }
            if (choiceStr.length() > 1) {
                System.out.println("Ошибка: Введен недопустимый символ");
                break;
            }
            int choice = Integer.parseInt(choiceStr);
            if (Menu.size() < choice) {
                System.out.println("Ошибка: Проверьте номер команды");
                break;
            }
            Menu.execute(choice);
        }
    }

    public void endProgram() {
        work = false;
        System.out.println("До новых встреч!");
    }

    @Override
    public void printAnswer(String answer) {
        System.out.println(answer);
    }

    public void addMember(){
        System.out.println("Введите имя");
        String name = scanner.nextLine();
        System.out.println("Введите фамилию");
        String surname = scanner.nextLine();
        System.out.println("Укажите пол (M или W)");
        Sex sex = Sex.valueOf(scanner.nextLine());
        System.out.println("Укажите дату рождения (ДД.ММ.ГГГГ)");
        String dateB = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate dateOfBirth = LocalDate.parse(dateB, formatter);
        presenter.addMember(name, surname, sex, dateOfBirth);
    }

    public void getMemberList(){
        presenter.getMemberListInfo();
    }

    public void sortByAge() {
        presenter.sortByAge();
    }

    public void sortByName() {
        presenter.sortByName();
    }

    public Integer convertInputStrToInteger(){
        String memberStr = scanner.nextLine();
        return Integer.parseInt(memberStr);
    }

    public void addRelationship() {
        getMemberList();
        System.out.println("Введите id ребёнка из списка");
        Integer childId = convertInputStrToInteger();
        System.out.println("Введите id отца из списка");
        Integer fatherId = convertInputStrToInteger();
        System.out.println("Введите id матери из списка");
        Integer motherId = convertInputStrToInteger();
        presenter.addRelation(childId, fatherId, motherId);
    }

    public void removeMemeber(){
        getMemberList();
        System.out.println("Введите id кого нужно удалить");
        Integer id = Integer.parseInt(scanner.nextLine());
        presenter.removeMember(id);
        System.out.println("Член успешно удалён из дерева");
    }
}

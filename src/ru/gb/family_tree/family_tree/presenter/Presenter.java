package ru.gb.family_tree.family_tree.presenter;



import ru.gb.family_tree.family_tree.view.View;



public class Presenter {
    private final View view;
    private final Service service;

    public FamilyTreePresenter(View view) {
        this.view = view;
        service = new Service();
    }

    public void addMember(String name, String surname, Sex sex, LocalDate dateOfBirth) {
        service.addMember(name, surname, sex, dateOfBirth);
        getMemberListInfo();
    }

    public void addMember(String name, String surname, Sex sex, LocalDate dateOfBirth, LocalDate dateOfDeath,
                          Member child, Member father, Member mother) {
        service.addMember(name, surname, sex, dateOfBirth, dateOfDeath, child, father, mother);
        getMemberListInfo();
    }

    public void getMemberListInfo() {
        view.printAnswer(service.getMembersListInfo());
    }

    public void sortByAge() {
        service.sortTreeByBirthDate();
        getMemberListInfo();
    }

    public void sortByName() {
        service.sortTreeByName();
        getMemberListInfo();
    }

    public Member getMemberById(Integer id){
        return service.getMemberById(id);
    }

    public FamilyTree<Member> getFamilyTree(){
        return service.getFamilyTree();
    }

    public void setFamilyTree(FamilyTree<Member> tree){
        service.setFamilyTree(tree);
    }

    public void addRelation(Integer childId, Integer fatherId, Integer motherId) {
        service.addRelation(childId, fatherId, motherId);
    }

    public void removeMember(Integer memberId){
        service.removeMember(memberId);
    }
}
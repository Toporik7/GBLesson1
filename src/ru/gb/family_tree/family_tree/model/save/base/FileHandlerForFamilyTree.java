package ru.gb.family_tree.family_tree.model.save.base;

import ru.gb.family_tree.family_tree.model.familyTree.FamilyTree;
import ru.gb.family_tree.family_tree.model.human.Human;
import ru.gb.family_tree.family_tree.model.save.Writable;

public class FileHandlerForFamilyTree extends FileHandler implements Writable {
    private String filePath = "tree.out";

    @Override
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public boolean save(FamilyTree<Human> tree) {
        return super.save(tree, filePath);
    }

    @Override
    public FamilyTree<Human> read() {
        return (FamilyTree<Human>)super.read(filePath);
    }
}
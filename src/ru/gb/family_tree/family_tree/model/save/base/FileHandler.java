package ru.gb.family_tree.family_tree.model.save.base;


import ru.gb.family_tree.family_tree.model.familyTree.FamilyTree;
import ru.gb.family_tree.family_tree.model.human.Human;
import ru.gb.family_tree.family_tree.model.save.Writable;

import java.io.*;

public class FileHandler implements Writable {

    @Override
    public boolean save(Serializable serializable) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath))) {
            objectOutputStream.writeObject(serializable);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Object read(String filePath) {
        return null;
    }

}

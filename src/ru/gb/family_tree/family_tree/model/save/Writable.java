package ru.gb.family_tree.family_tree.model.save;

import java.io.Serializable;

public interface Writable {
    boolean save(Serializable serializable);
    Object read(String filePath);
    void setFilePath(String filePath);
}

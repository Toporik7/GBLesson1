package ru.gb.family_tree.family_tree.model.familyTree;

import java.util.Comparator;

public class FamilyComparatorByBirthDate<T extends TreeNode<T>> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2){
        return o1.getBirthDate().compareTo(o2.getBirthDate());
    }
}

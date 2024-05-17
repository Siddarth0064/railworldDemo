package com.day13;

import java.util.Comparator;

public class SortByStdName implements Comparator<StudentsOBJ> {

    @Override
    public int compare(StudentsOBJ o1, StudentsOBJ o2) {
        return o1.getStdName().compareTo(o2.getStdName());
    }
}

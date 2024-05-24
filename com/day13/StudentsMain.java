package com.day13;

import java.util.ArrayList;
import java.util.Collections;

public class StudentsMain{
    public static void main(String[] args) {
        ArrayList<StudentsOBJ> stdList = new ArrayList<StudentsOBJ>();

        stdList.add(new StudentsOBJ("EEE",1));
        stdList.add(new StudentsOBJ("DDD",2));
        stdList.add(new StudentsOBJ("AAA",3));
        stdList.add(new StudentsOBJ("BBB",4));
        stdList.add(new StudentsOBJ("CCC",5));

        System.out.println("Befor Sort:");
        System.out.println(stdList);

        Collections.sort(stdList,new SortByStdName());
        System.out.println("After Sort: ");
        System.out.println(stdList);
    }
}

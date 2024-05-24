package com.day15;

import com.day12.EmployeeList.EmployeeOBJ;
import com.day13.StudentsOBJ;

import java.util.*;

public class MapCollections {
    public static  void main(String[] args) {

        Map<String,Integer> map1 = new HashMap<String,Integer>();
        map1.put("Hari",35);
        map1.put("sumit",22);
        //map1.put("sumit",23);
        //map1.remove("sumit");      // Removeing Key
        map1.put("",101);
        map1.put("abcd",5);

        System.out.println("From Map 1:  "+map1);

        Map<String, Integer> map2 = new HashMap<>();
        map2.putAll(map1);
        System.out.println("From Map 2:  "+ map2);


        System.out.println("From Map 2 Key: " +map2.keySet()+"  From Map2 values:  "+ map2.values());

        System.out.println("using entrySet Method : "+ map1.entrySet());

        Map<String,Integer> map3 = new TreeMap<>();
        map3.put("aaa",1);
        map3.put("bbb",null);
        map3.put("",null);
        map3.put("ccc",5);
        System.out.println("From Map3: "+map3);


        List<StudentsOBJ> stdList = new ArrayList<>();
        Map<String,List<StudentsOBJ>> empMap = new HashMap<String, List<StudentsOBJ>>();

        stdList.add(new StudentsOBJ("Siddarth", 11));
        empMap.put("01", stdList);

        System.out.println(empMap);



        Stack<List<EmployeeOBJ>> stack = new Stack<>();
        List<EmployeeOBJ> empList1 = new ArrayList<>();
        List<EmployeeOBJ> empList2 = new ArrayList<>();

        empList1.add(new EmployeeOBJ("empName1","software",1));
        empList2.add(new EmployeeOBJ("empName2","software",2));

        stack.add(empList1);
        stack.add(empList2);
        System.out.println(stack);






    }
}

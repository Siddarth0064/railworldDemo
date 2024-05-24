package com.day10.interfaceType;

public class MainInterfaces {
    public static void main(String[] args) {
        StudentPojoClass std = new StudentPojoClass(12,"siddarth",20);
        System.out.print(std.rollNo()+" ");
        System.out.print(std.display()+" ");
        System.out.println(std.getMarks());

        StudentPojoClass std1 = new StudentPojoClass(13,"Ravi",15);
        System.out.print(std1.rollNo()+" ");
        System.out.print(std1.display()+" ");
        System.out.println(std1.getMarks());

        int result = std1.compareTo(std);
        switch (result) {
            case 0:
                System.out.println(std1.getName() + " Marks " + std.getName() + " are Equal");
                break;
            case -1:
                System.out.println(std1.getName() + " Marks Are Less than " + std.getName());
                break;
            case 1:
                System.out.println(std1.getName() + " Marks Are Greater than " + std.getName());
                break;
            default:
                System.out.println("Comparison result is unexpected");
                break;
        }



    }
}

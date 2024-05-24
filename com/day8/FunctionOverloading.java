package com.day8;

public class FunctionOverloading {
    public  void area(int length, int breadth) {
        System.out.println(length * breadth);
    }

    public  void area(double radius) {
        double circleArea = Math.PI * radius * radius;
        System.out.println(circleArea);
    }

    public void area(double base, double height) {
        double triangleArea = 0.5 * base * height;
        System.out.println(triangleArea);
    }

    public static void main(String[] args) {
        FunctionOverloading funOver = new FunctionOverloading();

        
       funOver.area(10,20);
        funOver.area(20.30,30.20);
        funOver.area(20.30);
    }

}

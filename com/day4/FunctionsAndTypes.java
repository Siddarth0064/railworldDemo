package com.day4;

public class FunctionsAndTypes {


        public static void main(String[] args) {
            System.out.println("Implementing Interface Methods and Defining Functions and its Types");

            Main main = new Main();
            main.takesParameterNoReturnType("It takes input but does not return anything.");
            String type2 = main.takesParameterReturnString("It takes input and Return String.");
            System.out.println("Type 2: "+ type2);
            main.noParameterNoReturnType();
            String type4 =main.noParameterReturnString();
            System.out.println("Type 4: "+type4);
        }
    }



class Main implements InterfaceType{
    public void takesParameterNoReturnType(String str) {
        System.out.println("Type 1: " + str);
    }
    public String takesParameterReturnString(String str){
        return str;
    }
    public void noParameterNoReturnType(){
        System.out.println("Type 3: "+"It Not Accepts Parameter and Not Return Anything");
    }
    public String noParameterReturnString(){
        return "It Not Accepts Parameter but It Return String";
    }
}
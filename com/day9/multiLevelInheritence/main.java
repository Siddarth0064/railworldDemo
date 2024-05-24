package com.day9.multiLevelInheritence;

import java.util.Arrays;

public class main {
    public static void downCasting(Company company){
        company.companyType();
        company.vehicleType();
        company.DriverName();

    }
    public static void main(String[] args) {
        Company company = new Company();

        main.downCasting(company);




        StringBuilder sb = new StringBuilder();
        sb.append("hello its a Great Day And Enjoy Guys");
        String st ="hello its a Great Day And Enjoy Guys";

        System.out.println(sb);
        System.out.println(sb.equals(st));
        System.out.println(sb.reverse());
        System.out.println(sb.capacity());

        String str2[]=st.split(" ");
        System.out.println(Arrays.toString(str2));
    }
}

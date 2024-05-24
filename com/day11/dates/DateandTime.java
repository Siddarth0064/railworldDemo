package com.day11.dates;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateandTime {
    public static void main(String[] args) {
        LocalDateTime timeDate = LocalDateTime.now();
        System.out.println(timeDate);

        LocalDate localDate = LocalDate.from(ZonedDateTime.now());
        System.out.println(localDate);

        LocalTime localTime = LocalTime.from(ZonedDateTime.now());
        System.out.println(localTime);

        System.out.println(currectTime());

        String s="1995-01-02";

        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate localDate2=LocalDate.now();
        String s1 = localDate2.format(dateTimeFormatter);
        System.out.println(s1);
        System.out.println(localDate2.format(dateTimeFormatter));

         LocalDate localDate1 = LocalDate.parse(s);
         String s2 = localDate1.format(dateTimeFormatter);
         System.out.println(s2);

    }
    public static  LocalTime currectTime(){
        return LocalTime.now();
    }
}

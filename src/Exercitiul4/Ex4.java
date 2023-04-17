package Exercitiul4;

import java.util.List;

public class Ex4 {
    public static void main(String[] args){
        DaySchedule luni = new DaySchedule(DayOfWeek.MONDAY, List.of(new String[]{"Curatenie", "De invatat"}));
        System.out.println("On " + luni.getDayOfWeek() + " I have to : " + luni.getActivities());
    }
}



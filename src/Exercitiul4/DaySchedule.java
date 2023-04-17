package Exercitiul4;

import java.util.List;

public class DaySchedule {
    private DayOfWeek dayOfWeek;
    private List<String> activitati;

    public DaySchedule(DayOfWeek dayOfWeek, List<String> activitati) {
        this.dayOfWeek = dayOfWeek;
        this.activitati = activitati;
    }
    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }
    public List<String> getActivities() {
        return activitati;
    }
}

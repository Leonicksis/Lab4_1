package com.company;

public class Main {

    public static void main(String[] args) {

        Calendar cal = new Calendar();
        cal.Show();
        cal.AddHoliday("Christmas", 1, 6);
        cal.AddHoliday("Day of life", 15, 16);
        cal.AddHoliday("Communism is come", 100, 366);
        cal.AddHoliday("Quarantine", 64, 88);
        cal.Show();

    }
}
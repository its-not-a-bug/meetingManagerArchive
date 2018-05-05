package com.manager;

import java.util.Date;

public class Appointment {
    private String name;
    private String person;
    private Date date;
    private String place;
    private String number;
    private String description;
    private int minutesBefore;
    private boolean isAppoinmentDone;

    public Appointment(String name, String person, Date date, String place, String number, String description, int minutesBefore, boolean isAppoinmentDone) {
        this.name = name;
        this.person = person;
        this.date = date;
        this.place = place;
        this.number = number;
        this.description = description;
        this.minutesBefore = minutesBefore;
        this.isAppoinmentDone = isAppoinmentDone;
    }

    public String getName() {
        return name;
    }

    public String getPerson() {
        return person;
    }

    public Date getDate() {
        return date;
    }

    public String getPlace() {
        return place;
    }

    public String getNumber() {
        return number;
    }

    public String getDescription() {
        return description;
    }

    public int getMinutesBefore() {
        return minutesBefore;
    }

    public boolean isAppoinmentDone() {
        return isAppoinmentDone;
    }
}

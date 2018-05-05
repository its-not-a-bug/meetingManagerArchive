package com.manager;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class Menu {
    private Appointment appointment;
    private Scanner scanner = new Scanner(System.in);

    public Menu(Appointment appointment) {
        this.appointment = appointment;
    }

    public String addName() {
        System.out.print("Type in name of appointment: ");
        String name = scanner.nextLine();
        return name;
    }

    public String addPerson() {
        System.out.print("Type in person: ");
        String person = scanner.nextLine();
        return person;
    }

    public String addDate() {
        System.out.print("Type in date ");
        String date = scanner.nextLine();
        return date;
    }

    public String addPlace() {
        System.out.print("Type in place: ");
        String place = scanner.nextLine();
        return place;
    }

    public String addNumber() {
        System.out.print("Type in phone number: ");
        String number = scanner.nextLine();
        return number;
    }

    public String addDescription() {
        System.out.print("Type in description: ");
        String name = scanner.nextLine();
        return name;
    }

    public int addMinutesBefore() {
        System.out.print("Type in how long before appointment send a message: ");
        int minutesBefore = scanner.nextInt();
        return minutesBefore;
    }
}

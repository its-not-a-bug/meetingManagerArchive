package com.manager;

import java.util.ArrayList;
import java.util.List;

public class DbController {
    private List<Appointment> appointmentList = new ArrayList<>();

    public String addAppointment(Appointment appointment) {
        appointmentList.add(appointment);
        return "Appointment added!";
    }

    public String editAppointment(int id, Appointment appointment) {
        appointmentList.set(id, appointment);
        return "Appointment edited!";
    }

    public String deleteAppointment(int id) {
        appointmentList.remove(id);
        return "Appointment deleted!";
    }

    public String getAppointments() {
        return appointmentList.toString();
    }
}

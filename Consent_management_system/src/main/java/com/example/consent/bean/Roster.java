package com.example.consent.bean;

import javax.persistence.*;
import java.sql.Time;

@Entity
public class Roster {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String UserID;
    @Column(nullable = false)
    private String Role;

//    references AR ID in AR table
    @Column(nullable = false)
    private String AR_ID;
    private Time Duty_Start_Time;
    private Time Duty_End_Time;
//    Shift for managing diff days time
    private Json Shift;
    @Column(nullable = false)
    private String Departments;

    public Roster() {
    }

    public Roster(String userID, String role, String AR_ID, Time duty_Start_Time, Time duty_End_Time, Json shift, String departments) {
        UserID = userID;
        Role = role;
        this.AR_ID = AR_ID;
        Duty_Start_Time = duty_Start_Time;
        Duty_End_Time = duty_End_Time;
        Shift = shift;
        Departments = departments;
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String userID) {
        UserID = userID;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }

    public String getAR_ID() {
        return AR_ID;
    }

    public void setAR_ID(String AR_ID) {
        this.AR_ID = AR_ID;
    }

    public Time getDuty_Start_Time() {
        return Duty_Start_Time;
    }

    public void setDuty_Start_Time(Time duty_Start_Time) {
        Duty_Start_Time = duty_Start_Time;
    }

    public Time getDuty_End_Time() {
        return Duty_End_Time;
    }

    public void setDuty_End_Time(Time duty_End_Time) {
        Duty_End_Time = duty_End_Time;
    }

    public Json getShift() {
        return Shift;
    }

    public void setShift(Json shift) {
        Shift = shift;
    }

    public String getDepartments() {
        return Departments;
    }

    public void setDepartments(String departments) {
        Departments = departments;
    }
}
//Table  ( UserID (id of nurse or etc), Role, AR ID (references AR ID in AR table) ,Duty_start_time, Duty_end_time, Sun,Mon,Tues,Wed,Thurs,Fri,Sat , Department)
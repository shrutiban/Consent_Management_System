package com.example.consent.bean;
//import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;
@Entity
public class Patient_Demographic_Details {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String PID;

    @Column(nullable = false)
    private String Patient_Name;

    @Column(nullable = false, unique = true)
    private String consenter_id;

    @Column(nullable = false)
    private Date dob;
    @Column(nullable = false, unique = true)
    private String type;
    @Column(nullable = false)
    private String gender;
    private String address;
    @Column(nullable = false, unique = true)
    private Integer contact_number;
    @Column(nullable = false, unique = true)
    private String email;

    public Patient_Demographic_Details(String PID, String patient_Name, String consenter_id, Date dob, String type, String gender, String address, Integer contact_number, String email) {
        this.PID = PID;
        Patient_Name = patient_Name;
        this.consenter_id = consenter_id;
        this.dob = dob;
        this.type = type;
        this.gender = gender;
        this.address = address;
        this.contact_number = contact_number;
        this.email = email;
    }

    public Patient_Demographic_Details() {

    }

    public String getPID() {
        return PID;
    }

    public void setPID(String PID) {
        this.PID = PID;
    }

    public String getPatient_Name() {
        return Patient_Name;
    }

    public void setPatient_Name(String patient_Name) {
        Patient_Name = patient_Name;
    }

    public String getConsenter_id() {
        return consenter_id;
    }

    public void setConsenter_id(String consenter_id) {
        this.consenter_id = consenter_id;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getContact_number() {
        return contact_number;
    }

    public void setContact_number(Integer contact_number) {
        this.contact_number = contact_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

//    Table (PID, Patient_Name, consenter_id, dob, type, gender, address, contact_number, email)



package com.iiitb.ConsentManagement.ConsentManagement.Beans;


import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Component
@Table(name="demographic_details")
public class DemographicDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer patientID;

    @Column(nullable = false)
    private String firstName;

    private String lastName;

    @Column(nullable = false,unique = true)
    private String email;

    @Column(nullable = false,unique = true)
    private String phoneNumber;

    @Column(nullable = false)
    private String address;

    @Column(nullable=false)
    private Integer age;

    @Column(nullable = false)
    private String bloodGroup;

    @Column(nullable=false)
    private String gender;

    public DemographicDetails() {
    }

    public DemographicDetails(Integer patientID, String firstName, String lastName, String email, String phoneNumber, String address, Integer age, String bloodGroup, String gender) {
        this.patientID = patientID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.age = age;
        this.bloodGroup = bloodGroup;
        this.gender = gender;
    }

    public Integer getPatientID() {
        return patientID;
    }

    public void setPatientID(Integer patientID) {
        this.patientID = patientID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

package com.example.consent.bean;

import javax.annotation.processing.Generated;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Activity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String activity_id;
    @Column(nullable = false)
    private String activity_name;

    public Activity(String activity_id, String activity_name) {
        this.activity_id = activity_id;
        this.activity_name = activity_name;
    }

    public Activity() {
    }

    public String getActivity_id() {
        return activity_id;
    }

    public void setActivity_id(String activity_id) {
        this.activity_id = activity_id;
    }

    public String getActivity_name() {
        return activity_name;
    }

    public void setActivity_name(String activity_name) {
        this.activity_name = activity_name;
    }
}

//Activity – activity id, activity name
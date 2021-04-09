package com.example.consent.bean;

//import com.fasterxml.jackson.annotation.JsonCreator;
//import com.fasterxml.jackson.annotation.JsonFormat;
//import com.fasterxml.jackson.annotation.JsonValue;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Health_Activity_Mapping {
    @Id
    @GeneratedValue()
    private String Health_Service_Id, Activity_Id;
    private String Prev_Activity, Next_Activity;
    private Json Precondition, Postcondition;

    public Health_Activity_Mapping() {
    }

    public Health_Activity_Mapping(String health_Service_Id, String activity_Id, String prev_Activity, String next_Activity, Json precondition, Json postcondition) {
        Health_Service_Id = health_Service_Id;
        Activity_Id = activity_Id;
        Prev_Activity = prev_Activity;
        Next_Activity = next_Activity;
        Precondition = precondition;
        Postcondition = postcondition;
    }

    public String getHealth_Service_Id() {
        return Health_Service_Id;
    }

    public void setHealth_Service_Id(String health_Service_Id) {
        Health_Service_Id = health_Service_Id;
    }

    public String getActivity_Id() {
        return Activity_Id;
    }

    public void setActivity_Id(String activity_Id) {
        Activity_Id = activity_Id;
    }

    public String getPrev_Activity() {
        return Prev_Activity;
    }

    public void setPrev_Activity(String prev_Activity) {
        Prev_Activity = prev_Activity;
    }

    public String getNext_Activity() {
        return Next_Activity;
    }

    public void setNext_Activity(String next_Activity) {
        Next_Activity = next_Activity;
    }

    public Json getPrecondition() {
        return Precondition;
    }

    public void setPrecondition(Json precondition) {
        Precondition = precondition;
    }

    public Json getPostcondition() {
        return Postcondition;
    }

    public void setPostcondition(Json postcondition) {
        Postcondition = postcondition;
    }
}
//    Health Activity Mapping – Health Service Id, Activity Id, Prev Activity, Next Activity, Precondition, 	Postcondition

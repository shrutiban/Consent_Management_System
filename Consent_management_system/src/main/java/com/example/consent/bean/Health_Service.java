package com.example.consent.bean;

import javax.persistence.*;
import java.util.List;

@Entity
public class Health_Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String Health_Service_Id;
    private String Name;
    private String Type;

//    @OneToMany(mappedBy="Activity")
//    private List<Student_Course> s;
//    @ManyToOne
//    @JoinColumn(name="facutly")
//    private Employee faculty;
    public Health_Service() {
    }

    public Health_Service(String health_Service_Id, String name, String type) {
        Health_Service_Id = health_Service_Id;
        Name = name;
        Type = type;
    }

    public String getHealth_Service_Id() {
        return Health_Service_Id;
    }

    public void setHealth_Service_Id(String health_Service_Id) {
        Health_Service_Id = health_Service_Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }
}

//        3.2 Health Service – Health Service Id, Name, Type
//(health service is a process, under which all activities are performed)
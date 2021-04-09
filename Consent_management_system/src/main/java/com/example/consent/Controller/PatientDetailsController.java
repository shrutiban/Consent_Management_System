package com.iiitb.ConsentManagement.ConsentManagement.Controller;

import com.iiitb.ConsentManagement.ConsentManagement.Beans.DemographicDetails;
import com.iiitb.ConsentManagement.ConsentManagement.Services.PatientDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/api")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PatientDetailsController {

    private PatientDetailsService patientDetailsService;

    @Autowired
    public PatientDetailsController(PatientDetailsService patientDetailsService)
    {
        this.patientDetailsService = patientDetailsService;
    }

    @PostMapping(path="/register", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public @ResponseBody
    ResponseEntity addPatientDemographicData(@RequestBody final DemographicDetails details)
    {
        System.out.println("Inside PatientDetailsController patient firstname: "+details.getFirstName());
        System.out.println("Inside PatientDetailsController patient Lastname: "+details.getLastName());
        System.out.println("Inside PatientDetailsController patient Email: "+details.getEmail());
        System.out.println("Inside PatientDetailsController patient Phone: "+details.getPhoneNumber());
        System.out.println("Inside PatientDetailsController patient Age: "+details.getAge());
        System.out.println("Inside PatientDetailsController patient Address: "+details.getAddress());
        System.out.println("Inside PatientDetailsController patient Bloodgroup: "+details.getBloodGroup());
        System.out.println("Inside PatientDetailsController patient Gender: "+details.getGender());

        boolean result = patientDetailsService.addPatientDemographicDetails(details);

        if(result == false)
            return ResponseEntity.status(401).build();

        return ResponseEntity.ok().build();
    }



}

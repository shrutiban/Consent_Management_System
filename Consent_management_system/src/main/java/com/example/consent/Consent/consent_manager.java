package com.example.consent.Consent;

import java.util.List;

public class consent_manager {

//    This method will be called in post condition of Registration Activity
    public Consent createConsent(String PID, String Health_Service_Id, String AID){
//        From Health_Service_Id and AID in Health_Activity_Mapping table we will fetch the role, next_activity_id.
        Consent c1 = new Consent (PID,HSID,NAID,Role,validity);
                // save the consent by calling saveConsent() for Consent DB.
//        logging
        return c1;
    }

//
    public Consent updateConsent(Consent obj){
        // we will have all the fields needed in Consent obj only, we will query as we did in create consent method
        // Now we will update the role and activity ID.
        // So the consent obj will be valid only for next activity.
        Consent c2 = new Consent (PID,HSID,NAID,Role,validity);
        return c2;
    }
    public Consent validate(Consent obj){
        getConsent();
        // we will extract the list values returned by the getConsent() and match those values against
        //the Consent object we have
    }

    public List<Object> getConsent(String PID){
//        Write a query on the consent_db table to get the consent object with matching PID and validity =true;

        return (List of object);
    }
}

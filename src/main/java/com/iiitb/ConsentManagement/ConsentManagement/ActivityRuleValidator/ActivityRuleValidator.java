package com.iiitb.ConsentManagement.ConsentManagement.ActivityRuleValidator;

import com.iiitb.ConsentManagement.ConsentManagement.Beans.*;
import com.iiitb.ConsentManagement.ConsentManagement.ConsentManager.ConsentService;
import com.iiitb.ConsentManagement.ConsentManagement.Services.RulesService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.inject.Named;
import java.time.LocalTime;
import java.util.List;

// This is service class

@Named
public class ActivityRuleValidator {


    RulesService rulesService;
    ConsentService consentService;


    @Autowired
    public ActivityRuleValidator(RulesService rulesService, ConsentService consentService)
    {
        this.rulesService = rulesService;
        this.consentService = consentService;

    }

    public String validateRegistrationActivityRule(String consent, String operation, String purpose, String tableName, ROLE actorRole)
    {

        MethodType operationPermitted =  rulesService.getMethodTypeFromOperation(operation);
        HealthServiceType healthServiceType ;
        List<ROLE> rolesPermitted = null;

        System.out.println("[ActivityRuleValidator]:OperationPermitted is: "+ operationPermitted);

        if(!consent.equals("true"))  // patient has selected the checkbox in frontend form and hence true
            return "INVALID_CONSENT";       // Consent is not given


        System.out.println("Before operationpermitted check");

        if(operationPermitted.toString().equals("INVALID"))
                return "INVALID_OPERATION";       // INVALID operation. This operation is either not mapped in spring boot or not defined.


        try
        {
            healthServiceType = HealthServiceType.valueOf(purpose.toUpperCase());
        }
        catch(Exception e)
        {
            System.out.println("[EXCEPTION]: Inside ActivityRuleValidator-validateRegistrationActivityRules(): Failed to get HealthServiceType from given Purpose");
            return "INVALID_PURPOSE";       // if we are unable to get healthservice from purpose then we get exception, we catch it and return from it.
        }


        System.out.println("HealthService Type is:"+healthServiceType);
        System.out.println("Before going to getRolesPermitted()");

        rolesPermitted = rulesService.getRolesPermitted(tableName,operationPermitted);

        System.out.println("After getRolesPermitted call is over");

        if(! rolesPermitted.contains(actorRole))
                return "PERMISSION_DENIED_FOR_ROLE";      // given role doesn't have permission to do this operation

        return "SUCCESS"; // every validation rule check is passed successfully
    }


    public String activityRuleValidation(String patientID, String actorID, ConsentType consentForOperation, String operation, String tableName, ROLE actorRole)//,String purpose)
    {

        MethodType operationPermitted =  rulesService.getMethodTypeFromOperation(operation);
        HealthServiceType healthServiceType ;
        List<ROLE> rolesPermitted = null;
        LocalTime endTime = null;


        System.out.println("[ActivityRuleValidator]:OperationPermitted is: "+ operationPermitted);

        Consent consent = consentService.getConsent(patientID,actorID,consentForOperation,endTime);


       if(consent == null)
        {
            System.out.println("Invalid consent. Consent doesn't exist.");
            return "CONSENT_DONT_EXIST";
        }

        System.out.println("After fetching consent object.");
        System.out.println("Actor ID is: "+consent.getActorID());
        System.out.println("PatientID is: "+consent.getPatientID());
        System.out.println("Before operationpermitted check");

        if(operationPermitted.toString().equals("INVALID"))
            return "INVALID_OPERATION";       // INVALID operation. This operation is either not mapped in spring boot or not defined.


//        try
//        {
//            healthServiceType = HealthServiceType.valueOf(purpose.toUpperCase());
//        }
//        catch(Exception e)
//        {
//            System.out.println("[EXCEPTION]: Inside ActivityRuleValidator-validateRegistrationActivityRules(): Failed to get HealthServiceType from given Purpose");
//            return "INVALID_PURPOSE";       // if we are unable to get healthservice from purpose then we get exception, we catch it and return from it.
//        }


     //   System.out.println("HealthService Type is:"+healthServiceType);
        System.out.println("Before going to getRolesPermitted()");

        rolesPermitted = rulesService.getRolesPermitted(tableName,operationPermitted);

        System.out.println("After getRolesPermitted call is over");

        if(! rolesPermitted.contains(actorRole))
            return "PERMISSION_DENIED_FOR_ROLE";      // given role doesn't have permission to do this operation

        return "SUCCESS"; // every validation rule check is passed successfully
    }


}

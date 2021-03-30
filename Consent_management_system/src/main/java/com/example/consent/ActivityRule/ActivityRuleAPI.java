package com.example.consent.ActivityRule;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Date;

public class ActivityRuleAPI {
    public boolean validateActivityRule(String userId, String location, Date time, String purpose, String operation){
        //Take all the inputs and write create query to fetch the corresponding matching activity rule.
        //If matching activity rule is found fetch precondition which is in json format and check if it is satisfied.

        boolean check_Precondition = checkPrecondition(userId, JsonObject preCondition);
        if(check_Precondition){
            if(operation=="create")
            {
                // saveData();
                // updateStatus();
                // logData();
            }
            else if(operation == "update")
            {
                //saveData();
                // logData();
            }
            else {
                //logData();
            }
        }

        return check_Precondition;
    }

    public boolean checkPrecondition(String userId, JsonObject preCondition){
        //Now we need to check if precondition is satisfied. For this, we will check status field in Patient table.
        // If status == Code of previous activity, this means previous activity is completed.
        return true;
    }

}

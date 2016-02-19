package helloWorld.HelloWorldWorkflowAsync;

import com.amazonaws.services.simpleworkflow.flow.annotations.Activities;
import com.amazonaws.services.simpleworkflow.flow.annotations.ActivityRegistrationOptions;

@ActivityRegistrationOptions(defaultTaskScheduleToStartTimeoutSeconds = 300,
                             defaultTaskStartToCloseTimeoutSeconds = 10)
@Activities(version="2.0")

/*
 * 
 * The annotations provide configuration information and direct the AWS Flow 
 * Framework for Java annotation processor to use the interface definition to 
 * generate an activities client class, which is discussed later.
 * */

public interface GreeterActivities {
   public String getName();
   public void say(String what);
}
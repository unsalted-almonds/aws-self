package helloWorld.HelloWorldWorkflow;

import com.amazonaws.services.simpleworkflow.flow.annotations.Activities;
import com.amazonaws.services.simpleworkflow.flow.annotations.ActivityRegistrationOptions;

@ActivityRegistrationOptions(defaultTaskScheduleToStartTimeoutSeconds = 300,
                             defaultTaskStartToCloseTimeoutSeconds = 10)
@Activities(version="1.1")

/*
 * 
 * The annotations provide configuration information and direct the AWS Flow 
 * Framework for Java annotation processor to use the interface definition to 
 * generate an activities client class, which is discussed later.
 * */

public interface GreeterActivities {
   public String getName();
   public String getGreeting(String name);
   public void say(String what);
}
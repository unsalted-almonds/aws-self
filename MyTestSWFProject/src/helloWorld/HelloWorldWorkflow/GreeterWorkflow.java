package helloWorld.HelloWorldWorkflow;

import com.amazonaws.services.simpleworkflow.flow.annotations.Execute;
import com.amazonaws.services.simpleworkflow.flow.annotations.Workflow;
import com.amazonaws.services.simpleworkflow.flow.annotations.WorkflowRegistrationOptions;

@Workflow
@WorkflowRegistrationOptions(defaultExecutionStartToCloseTimeoutSeconds = 3600)
public interface GreeterWorkflow {
	/*
	 * 1. It identifies greet as the workflow's entry point¡ªthe method that the 
	 * workflow starter calls to start the workflow. 
	 * 
	 * 2.It specifies the workflow's version number
	 * */
   @Execute(version = "1.0")
   public void greet();
}
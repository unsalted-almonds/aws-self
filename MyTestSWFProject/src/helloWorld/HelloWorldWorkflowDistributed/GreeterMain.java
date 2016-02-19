package helloWorld.HelloWorldWorkflowDistributed;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow;
import com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflowClient;


/*
 * i have not got it working with Maven 
 * */
public class GreeterMain {

   public static void main(String[] args) throws Exception {
     ClientConfiguration config = new ClientConfiguration().withSocketTimeout(70*1000);

     String swfAccessId = "AKIAJR4XXQVTY4Y7JDZA";//System.getenv("AWS_ACCESS_KEY_ID");
     String swfSecretKey = "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";//System.getenv("AWS_SECRET_KEY");
     AWSCredentials awsCredentials = new BasicAWSCredentials(swfAccessId, swfSecretKey);

     AmazonSimpleWorkflow service = new AmazonSimpleWorkflowClient(awsCredentials, config);
     
     // i am using Oregon right now 
     service.setEndpoint("https://swf.us-west-2.amazonaws.com");

     String domain = "helloWorldWalkthrough";

     GreeterWorkflowClientExternalFactory factory = new GreeterWorkflowClientExternalFactoryImpl(service, domain);
     GreeterWorkflowClientExternal greeter = factory.getClient("async22");
     greeter.greet();
   }
}
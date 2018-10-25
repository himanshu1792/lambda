package aws_lambda.aws_lamda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import model.CognitoModel;

public class AwsLambdaDynamoDbOnCognito implements RequestHandler<CognitoModel, String>{

	public String handleRequest(CognitoModel input, Context context) {
		
		LambdaLogger logger = context.getLogger();
		logger.log("input ---"+input.toString());
		return input.toString();
	}	
}

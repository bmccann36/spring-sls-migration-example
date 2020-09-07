package com.springserverless;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Collections;
import java.util.Map;

public class ExampleHandlerApiG implements RequestHandler<Map<String, Object>, ApiGatewayResponse> {

    private Gson gson = new GsonBuilder().setPrettyPrinting().create();


    @Override
    public ApiGatewayResponse handleRequest(Map<String, Object> event, Context context) {
        LambdaLogger logger = context.getLogger();
        String response = new String("200 OK");
        // process event
        logger.log("EVENT: " + event);
        logger.log("\n EVENT TYPE: " + event.getClass().toString() + "\n");

        // send the response back
        return ApiGatewayResponse.builder()
                .setStatusCode(200)
                .setObjectBody("function executed")
                .setHeaders(Collections.singletonMap("X-Powered-By", "AWS Lambda & Serverless"))
                .build();
    }
}
package com.springserverless;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Map;

public class ExampleHandler implements RequestHandler<Map<String,String>, String> {

    private Gson gson = new GsonBuilder().setPrettyPrinting().create();


    @Override
    public String handleRequest(Map<String,String> event, Context context) {
        LambdaLogger logger = context.getLogger();
        String response = new String("200 OK");
        // process event
        logger.log("EVENT: " + event);
        logger.log("\n EVENT TYPE: " + event.getClass().toString() + "\n");
        return response;
    }
}
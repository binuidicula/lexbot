package com.amazon.bots.quiz;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class Hello implements RequestHandler<Integer, String>{


    @Override
    public String handleRequest(Integer myCount, Context context) {
        return String.valueOf(myCount);
    }

}
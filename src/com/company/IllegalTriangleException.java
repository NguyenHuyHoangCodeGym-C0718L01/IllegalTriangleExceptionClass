package com.company;

public class IllegalTriangleException extends Exception{
    String errorMessage;
    public IllegalTriangleException(String inErrorMessage) {
        errorMessage = inErrorMessage;
    }

    public String getString(){
        return errorMessage;
    }
}

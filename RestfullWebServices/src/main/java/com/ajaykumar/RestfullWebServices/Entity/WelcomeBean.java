package com.ajaykumar.RestfullWebServices.Entity;

public class WelcomeBean {
    private String message;
    public WelcomeBean(String message){
        this.message=message;
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

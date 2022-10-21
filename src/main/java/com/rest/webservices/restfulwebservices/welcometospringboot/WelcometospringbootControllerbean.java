package com.rest.webservices.restfulwebservices.welcometospringboot;


public class WelcometospringbootControllerbean {
    private String message;
    public WelcometospringbootControllerbean(String message){
            this.message = message;
    }
    public String getMessage(){
        return message;
    }
    public void setMessage(String message){
        this.message = message;
    }
    @Override
    public String toString(){
        return "Welcome to springboot bean [message=" + message + "]";
    }
}

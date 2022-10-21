package com.rest.webservices.restfulwebservices.Employee;

public class ResourceNotFoundException  extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }

}

package com.srdevpereira.webservice.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(Object id) {
        super("Resource not fund. Id: " + id);
    }
}

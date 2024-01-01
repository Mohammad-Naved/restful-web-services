package com.webservices.restfulwebservice.helloworld;

public class HellowWorldBean {
    private final String message;

    public HellowWorldBean(String message) {
        this.message=message;
    }

    @Override
    public String toString() {
        return "HellowWorldBean{" +
                "message='" + message + '\'' +
                '}';
    }

    public String getMessage() {
        return message;
    }
}

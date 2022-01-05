package com.example.restservice.json;

import java.util.Objects;

public class Greeting {
    private String message;

    public Greeting() {

    }

    public Greeting(String message) {
        this.message = message;
    }
    //Use Generate getter and setter in Intellij
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Greeting)) return false;
        Greeting greeting = (Greeting) object; //type change by ()
        return Objects.equals(message, greeting.message);
    }

    @Override
    public String toString() {
        return message;
    }
}

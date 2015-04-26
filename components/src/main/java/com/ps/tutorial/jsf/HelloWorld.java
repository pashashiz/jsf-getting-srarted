package com.ps.tutorial.jsf;

import javax.ejb.Stateful;
import javax.inject.Named;

@Stateful
@Named
public class HelloWorld {

    public HelloWorld() {
        System.out.println("HelloWorld started!");
    }
    public String getMessage() {
        return "Hello World!";
    }

}

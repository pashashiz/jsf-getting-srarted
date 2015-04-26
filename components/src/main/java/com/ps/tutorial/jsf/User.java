package com.ps.tutorial.jsf;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@SessionScoped
@Named
public class User implements Serializable {

    private boolean isInit;

    private String name;

    private String male;

    public User() {
        System.out.println("Created");
    }

    public boolean isInit() {
        System.out.println("Is init");
        return isInit;
    }

    public void setInit(boolean isInit) {
        System.out.println("Get init");
        this.isInit = isInit;
    }

    public String getName() {
        System.out.println("Get name");
        return name;
    }

    public void setName(String name) {
        System.out.println("Set name");
        this.name = name;
    }

    public String getMale() {
        System.out.println("Get male");
        return male;
    }

    public void setMale(String male) {
        System.out.println("Set male");
        this.male = male;
    }

}

package com.ps.tutorial.jsf;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@RequestScoped
@Named
public class NavigationController {

    private String pageId;
    @Inject
    private User user;

    public String goToHome() {
        return "hello";
    }

    public String goToPage1() {
        return "page1";
    }

    public String goPage2() {
        return "page2";
    }

    public String goToUser() {
        if (!user.isInit()) {
            System.out.println("Init user...");
            user.setInit(true);
            user.setName("Pasha");
            user.setMale("Male");
        }
        return "user";
    }

    public void setPageId(String pageId) {
        this.pageId = pageId;
    }

    public String showPage(){
        switch (pageId) {
            case "1": return "page1";
            case "2": return "page2";
            default: return "hello";
        }
    }

}

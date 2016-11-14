package com.akhambir.controller;

import com.akhambir.controller.intervaces.Controller;

public class HomeController implements Controller {
    public String homePage() {
        return "home";       // TODO Create home.jsp and it will be used here
    }
}

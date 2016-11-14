package com.akhambir.util;

import com.akhambir.controller.HomeController;
import com.akhambir.controller.UserController;
import com.akhambir.controller.intervaces.Controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MainServlet extends HttpServlet {
    Map<Request, Controller> controllers = new HashMap<Request, Controller>();

    @Override
    public void init() throws ServletException {
        super.init();
        Controller userController = Factory.createUserController(UserController.class, Factory.getFakeConnection());

        controllers.put(Request.of("GET", "/home"), new HomeController());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    }
}

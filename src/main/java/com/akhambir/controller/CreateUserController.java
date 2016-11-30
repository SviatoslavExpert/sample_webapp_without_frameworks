package com.akhambir.controller;

import com.akhambir.service.UserService;
import com.akhambir.servlet.Request;
import com.akhambir.view.ViewModel;
import org.apache.log4j.Logger;
import com.akhambir.model.User;


public class CreateUserController implements Controller {

  private final Logger logger = Logger.getLogger(CreateUserController.class);
  private final UserService service;

  public CreateUserController(UserService service) {
    this.service = service;
  }

  @Override
  public ViewModel process(Request request) {

    String userName = request.getParameter("userName");
    String password = request.getParameter("password");
    String token = userName + System.nanoTime();

    service.create(User.from(userName, password, token));
    return new ViewModel("/profile.jsp")
        .addCookie("token", token);
  }
}

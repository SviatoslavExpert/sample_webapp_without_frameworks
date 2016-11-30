package com.akhambir.controller;

import com.akhambir.servlet.Request;
import com.akhambir.view.ViewModel;

public class ProfileController implements Controller {


  @Override
  public ViewModel process(Request request) {
    String userId = request.getParameter("userId");

    return new ViewModel("/profile.jsp");
  }
}

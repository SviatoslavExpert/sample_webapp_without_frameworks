package com.akhambir.controller;

import com.akhambir.servlet.Request;
import com.akhambir.view.ViewModel;

public class SignUpController implements Controller {
  @Override
  public ViewModel process(Request request) {
    return new ViewModel("/signup.jsp");
  }
}

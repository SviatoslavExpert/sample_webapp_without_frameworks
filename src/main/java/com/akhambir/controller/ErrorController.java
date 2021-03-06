package com.akhambir.controller;

import com.akhambir.servlet.Request;
import com.akhambir.view.ViewModel;

public class ErrorController implements Controller{
  @Override
  public ViewModel process(Request request) {
    return new ViewModel("/error.jsp")
        .withAttribute("error", request.getParameter("error"));
  }
}

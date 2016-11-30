package com.akhambir.controller;

import com.akhambir.servlet.Request;
import com.akhambir.view.ViewModel;

public interface Controller {

  ViewModel process(Request request);

}

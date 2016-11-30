package com.akhambir.controller;

import com.akhambir.servlet.Request;
import com.akhambir.view.ViewModel;
import com.akhambir.model.Category;
import com.akhambir.service.CategoryService;

import java.util.List;

public class GetAllCategoriesController implements Controller {

  private final CategoryService service;

  public GetAllCategoriesController(CategoryService service) {
    this.service = service;
  }

  @Override
  public ViewModel process(Request request) {
    List<Category> categories = service.findAll();
    return new ViewModel("/categories.jsp")
        .withAttribute("categories", categories);
  }
}

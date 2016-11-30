package com.akhambir.service;

import com.akhambir.model.Category;

import java.util.List;

public interface CategoryService {

  Category update(Category category);
  List<Category> findAll();

  Category create(Category category);
}

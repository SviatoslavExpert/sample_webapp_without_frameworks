package com.akhambir.service;

import com.akhambir.model.User;

public interface UserService {

  User create(User user);
  User findById(Integer id);
  User findByToken(String token);
}

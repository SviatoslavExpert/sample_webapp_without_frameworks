package com.akhambir.controller;

import com.akhambir.controller.intervaces.Controller;
import com.akhambir.service.interfaces.UserService;

public class UserController implements Controller {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
}

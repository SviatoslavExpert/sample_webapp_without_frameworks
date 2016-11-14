package com.akhambir.service;

import com.akhambir.dao.interfaces.GenericDao;
import com.akhambir.service.interfaces.UserService;

public class UserServiceImpl implements UserService {
    private final GenericDao genericDao;

    public UserServiceImpl(GenericDao genericDao) {
        this.genericDao = genericDao;
    }
}

package com.akhambir.util;

import com.akhambir.controller.intervaces.Controller;
import com.akhambir.dao.UserDaoImpl;
import com.akhambir.dao.interfaces.GenericDao;
import com.akhambir.service.UserServiceImpl;
import com.akhambir.service.interfaces.UserService;

import java.lang.reflect.Constructor;

public class Factory {

    public static Controller createUserController(Class<? extends Controller> clazz, FakeConnection fakeConnection) {
        Controller controller;
        try {
            Constructor<? extends Controller> constructor = clazz.getConstructor(UserService.class);
            UserService userService = getUserService(getUserDao(fakeConnection));
            controller = constructor.newInstance(userService);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
        return controller;
    }

    private static UserService getUserService(GenericDao genericDao) {
        return new UserServiceImpl(getUserDao(getFakeConnection()));
    }

    private static UserDaoImpl getUserDao(FakeConnection fakeConnection) {
        return new UserDaoImpl(fakeConnection);
    }

    public static FakeConnection getFakeConnection() {
        return new FakeConnection();
    }
}

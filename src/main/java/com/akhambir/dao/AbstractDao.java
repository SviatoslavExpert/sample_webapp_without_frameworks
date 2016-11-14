package com.akhambir.dao;

import com.akhambir.dao.interfaces.GenericDao;
import com.akhambir.util.FakeConnection;

public class AbstractDao<T> implements GenericDao<T> {
    private final FakeConnection fakeConnection;

    public AbstractDao(FakeConnection fakeConnection) {
        this.fakeConnection = fakeConnection;
    }

    public T create(T t) {
        return null;
    }

    public T read(T t) {
        return null;
    }

    public boolean update(T t) {
        return false;
    }

    public T delete(T t) {
        return null;
    }
}

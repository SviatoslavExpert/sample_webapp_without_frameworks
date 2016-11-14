package com.akhambir.dao.interfaces;

public interface GenericDao<T> {
    T create(T t);
    T read(T t);
    boolean update(T t);
    T delete(T t);
}

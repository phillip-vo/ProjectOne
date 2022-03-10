package com.revature.repository;

import java.util.List;

public interface Repository<T> {
    void save(T t);
    void update(T t);
    void delete(int id);
    T getById(int id);
    List<T> getAll();
}

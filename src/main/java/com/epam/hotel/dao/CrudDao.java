package com.epam.hotel.dao;

import com.epam.hotel.pool.ConnectionPoolException;

import java.util.List;
import java.util.Optional;

public interface CrudDao<T> {
    T find(Integer id) throws ConnectionPoolException;

    void save(T model);

    void update(T model);

    void delete(Integer id);

    List<T> findAll();
}

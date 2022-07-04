package com.epam.hotel.dao;

import com.epam.hotel.bean.User;
import com.epam.hotel.pool.ConnectionPool;
import com.epam.hotel.pool.ConnectionPoolException;

import java.sql.*;
import java.util.List;
import java.util.Optional;

public class SQLUserDao implements UserDao {
    private final ConnectionPool cp = new ConnectionPool();


    @Override
    public User authorization(String login, String password) throws DAOException {

        Connection con = null;
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            cp.initPoolData();
            con = cp.takeConnection();

            st = con.prepareStatement("INSERT INTO hotel_db.users(login, password,roles_id) VALUES (?, ?,1)");

            st.setString(1, login);
            st.setString(2, password);
            st.execute();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ConnectionPoolException e) {
            e.printStackTrace();
        } finally {
            cp.closeConnection(con, st);
        }

        return new User(login, password);
    }

    @Override
    public Optional find(Integer id) {
        return Optional.empty();
    }

    @Override
    public void save(User model) {

    }

    @Override
    public void update(User model) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public List<User> findAll() {
        return null;
    }


}

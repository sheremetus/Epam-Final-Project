package com.epam.hotel.dao;

import com.epam.hotel.bean.User;
import com.epam.hotel.pool.ConnectionPool;
import com.epam.hotel.pool.ConnectionPoolException;

import java.sql.*;
import java.util.List;
import java.util.Optional;

public class SQLUserDao implements UserDao {
    private final ConnectionPool cp = new ConnectionPool();
    Connection con = null;
    PreparedStatement st = null;

    ResultSet rs = null;

    @Override
    public void authorization(String login, String password) throws DAOException {


        try {
            cp.initPoolData();
            con = cp.takeConnection();

            st = con.prepareStatement("INSERT INTO hotel_db.users(login, password,roles_id) VALUES (?, ?,1)");

            st.setString(1, login);
            st.setString(2, password);
            st.execute();

        } catch (SQLException throwable) {
            throwable.printStackTrace();
        } catch (ConnectionPoolException e) {
            e.printStackTrace();
        } finally {
            cp.closeConnection(con, st);
        }


    }

    @Override
    public User getUser(int id) {
        User user = null;
        try {
            cp.initPoolData();
            con = cp.takeConnection();
            st = con.prepareStatement("SELECT * FROM hotel_db.users WHERE id = ? ");
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
                user = new User(rs.getString(2), rs.getString(3));
            }
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        } catch (ConnectionPoolException e) {
            e.printStackTrace();
        } finally {
            cp.closeConnection(con, st);

        }
        return user;
    }

    @Override
    public User getUser(String login, String password) {
        User user = null;
        try {
            cp.initPoolData();
            con = cp.takeConnection();
            st = con.prepareStatement("SELECT * FROM hotel_db.users WHERE login = ? AND password= ?");
            st.setString(1, login);
            st.setString(2, password);

            ResultSet rs = st.executeQuery();
            while(rs.next()) {
                user = new User(rs.getString(2), rs.getString(3));
            }
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        } catch (ConnectionPoolException e) {
            e.printStackTrace();
        } finally {
            cp.closeConnection(con, st);

        }
        return user;
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

package com.epam.hotel.dao.SQLDao;

import com.epam.hotel.bean.Guest;
import com.epam.hotel.bean.User;
import com.epam.hotel.dao.GuestInfoDao;
import com.epam.hotel.pool.ConnectionPool;
import com.epam.hotel.pool.ConnectionPoolException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class SQLGuestInfoDao implements GuestInfoDao {

    private final ConnectionPool cp = new ConnectionPool();
    Connection con = null;
    PreparedStatement st = null;


    @Override
    public Guest find(Integer id) {
        Guest guest = null;
        try {
            cp.initPoolData();
            con = cp.takeConnection();
            st = con.prepareStatement("SELECT * FROM hotel_db.guests WHERE users_id = ? ");
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {

                guest = new Guest(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getInt(4)
                );
            }

        } catch (ConnectionPoolException | SQLException e) {
            e.printStackTrace();
        }


        return guest;


    }

    @Override
    public void save(Guest model) {

    }

    @Override
    public void update(Guest model) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public List<Guest> findAll() {
        return null;
    }

    @Override
    public void addOrUpdateInfoAboutGuest(String name, String surname, int user_id) {
        try {
            cp.initPoolData();
            con = cp.takeConnection();

            st = con.prepareStatement("INSERT INTO hotel_db.guests (name,surname,administrator_id,users_id) VALUES (?,?,?,?) " +
                    "ON DUPLICATE KEY UPDATE `name`= ?,`surname` = ?,`administrator_id` = ?,`users_id`=?  ;");

            st.setString(1, name);
            st.setString(2, surname);
            st.setInt(3, 1);
            st.setInt(4, user_id);
            st.setString(5, name);
            st.setString(6, surname);
            st.setInt(7, 1);
            st.setInt(8, user_id);
            st.execute();

        } catch (SQLException throwable) {
            throwable.printStackTrace();
        } catch (ConnectionPoolException e) {
            e.printStackTrace();
        } finally {
            cp.closeConnection(con, st);
        }
    }
}

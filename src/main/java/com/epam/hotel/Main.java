package com.epam.hotel;


import com.epam.hotel.pool.ConnectionPool;
import com.epam.hotel.pool.ConnectionPoolException;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {


        Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        try {

            ConnectionPool cp = new ConnectionPool();
            cp.initPoolData();
            con = cp.takeConnection();

            System.err.println("OK");

            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM roles");

            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2));
            }

        } catch (SQLException | ConnectionPoolException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                if (st != null) {
                    st.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }
}

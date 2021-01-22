package com.icoderman.structural.facade.example1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcFacade {

    private Connection conn = null;

    public JdbcFacade() {
        try {
            conn = DriverManager.getConnection("jdbc:h2:mem:db");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public int createTable() {
        int count = 0;
        try {
            Statement sta = conn.createStatement();
            count = sta.executeUpdate("CREATE TABLE Address (ID INTEGER, StreetName VARCHAR (20), " +
                    "City VARCHAR(20))");
            sta.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }

    public int insertIntoTable() {
        int count = 0;
        try {
            Statement sta = conn.createStatement();
            count = sta.executeUpdate("INSERT INTO Address (ID, StreetName, City) " +
                    "values (1, '1234 Some street', 'Layton')");
            System.out.println(count + " record(s) created.");
            sta.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }

    public List<Address> getAddresses() {
        List<Address> addresses = new ArrayList<>();
        try {
            Statement sta = conn.createStatement();
            ResultSet rs = sta.executeQuery("SELECT * FROM Address");

            while (rs.next()) {
                addresses.add(new Address(rs.getString(1), rs.getString(2), rs.getString(3)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return addresses;
    }
}

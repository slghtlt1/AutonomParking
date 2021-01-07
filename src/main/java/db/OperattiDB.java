package db;

import db.ConnDB;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class OperattiDB {
    private static Connection conn;
    static {
        try {
            conn = ConnDB.createConn();
        }catch(Exception ex){
            System.out.println("nu merge conexiune: "+ex.getMessage());
        }
    }

    public static void insertData(String userIntroduced, String passIntroduced) throws SQLException {
        Statement st = conn.createStatement();
        st.executeUpdate("Insert into Users "+ "VALUES(default ,'"+userIntroduced+"', '"+passIntroduced+"')");
    }


    public void registerUser(String user, String pass) throws SQLException {
        Statement st = conn.createStatement();
        st.executeUpdate("Insert into Users" + "Values(user, pass");

    }
}

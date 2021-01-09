package db;

import db.ConnDB;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ValidateDB {

    public static boolean existDB(String user) throws SQLException, ClassNotFoundException {
        Statement st = ConnDB.createConn().createStatement();
        String querry = "Select user from Users";
        ResultSet rs = st.executeQuery(querry);

        while (rs.next()) {
            String userInserted = rs.getString("User");
            if (userInserted.equals(user)) {
                return true;
            }
        }
        return false;
    }

    /*return true if the pass is correct
    return false if the pass does not contains non alpha numerics numbers
     */
    public static boolean passCorrectLogin(String pass) throws SQLException, ClassNotFoundException {
        Statement st = ConnDB.createConn().createStatement();
        String querry = "Select pass from Users";
        ResultSet rs = st.executeQuery(querry);
        while (rs.next()) {
            String userInserted = rs.getString("Pass");
            if (userInserted.equals(pass)) {
                return true;
            }
        }
        return false;
    }

//1
    public static boolean passCorrectRegister(String passInserted) {
        if (passInserted.length() <= 10) {
            if (passInserted.matches("[a-zA-Z][0-9]")) {
                return true;
            }
        }
        return false;
    }
}

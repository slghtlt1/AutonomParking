package db;

import util.DBUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnDB {
    //TODO:URL si Driver le fac constante si le mut intr-o clasa de constante si folosesc constantele din clasa aia
    public static Connection createConn() throws ClassNotFoundException, SQLException {
        String user = "root";
        String pass = "slghtlt1";
        Class.forName(DBUtil.driver);
        return DriverManager.getConnection(DBUtil.url, user, pass);
    }

//1
}

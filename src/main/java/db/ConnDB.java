package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnDB {
    //TODO:URL si Driver le fac constante si le mut intr-o clasa de constante si folosesc constantele din clasa aia
    public static Connection createConn() throws ClassNotFoundException, SQLException {
        Class.forName(ConnectionDB.driver);
        return DriverManager.getConnection(ConnectionDB.url, "root", "slghtlt1");
    }
//1

}

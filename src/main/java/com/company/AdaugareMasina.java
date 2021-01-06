package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalTime;

public class AdaugareMasina {


    public static void AdaugareMasina(String nrInmatriculare, LocalDate dataIntrare, LocalTime oraIntrare) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/Persoane";
        Connection conn = DriverManager.getConnection(url,"root","slghtlt1");
        Statement st = conn.createStatement();

        st.executeUpdate("INSERT INTO ParcareAutonoma " +
                "VALUES (default ,'"+nrInmatriculare+"', '"+dataIntrare+"', '"+oraIntrare+"')");
        System.out.println(nrInmatriculare + " " + dataIntrare + " " + oraIntrare + " A fost inregistrat");
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablefx;

/**
 *
 * @author knmor
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Database {
        private static final String URL = "jdbc:mysql://localhost:3306/mahasiswa";
    private static final String USER = "foster";
    private static final String PASSWORD = "karombasan";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}

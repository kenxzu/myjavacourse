

package jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author knmor
 */
public class Koneksi {

    private static Koneksi instance = new Koneksi();
    private static Connection conn;

    public static Koneksi getInstance() {
        return instance;
    }

    public static Connection getConnection() {
        return conn;
    }

    public Koneksi() {
        try {
// Class.forName("com.mysql.jdbc.Driver");
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mahasiswa", "foster", "karombasan");

        } catch (SQLException | ClassNotFoundException ex) {
            System.err.println(ex.getMessage());
        }
        
        
    }
}

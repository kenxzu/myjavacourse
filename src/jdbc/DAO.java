package jdbc;

/**
 *
 * @author knmor
 */
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class DAO {

    public void readAll() {
        try {
            Connection con = Koneksi.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM mahasiswa");
            while (rs.next()) {
                System.out.println(rs.getString("ID"));
                System.out.print("Nama : ");
                System.out.println(rs.getString("nama"));
                System.out.println("alamat : " + rs.getString("alamat"));
            }
        } catch (SQLException ex) {
            System.err.println("read all error: " + ex.getMessage());
        }
    }

    public int insertOne(String n, int p) {
        try {
            Connection con = Koneksi.getConnection();
            Statement st = con.createStatement();
            String sql = "INSERT INTO user (name,password) VALUES ('"
                    + n + "','"
                    + p + "')";
            return st.executeUpdate(sql);
        } catch (SQLException ex) {
            System.err.println("insert error: " + ex.getMessage());
            return 0;
        }
    }
    
    
    public int deleteById(int id) {
        try {
            Connection con = Koneksi.getConnection();
            Statement st = con.createStatement();
            String sql = "DELETE FROM user WHERE id = " + id;
            return st.executeUpdate(sql);
            
        } catch (SQLException ex) {
            System.err.println("delete error: " + ex.getMessage());
            return 0;
        }
    }
    
    public int updateUserById(int id, String newName, int newPassword) {
        String sql = "UPDATE user SET name = ?, password = ? WHERE id = ?";
        try (Connection con = Koneksi.getConnection();
                
            PreparedStatement pst = con.prepareStatement(sql)) {
             
            pst.setString(1, newName);
            pst.setInt(2, newPassword);
            pst.setInt(3, id);

            return pst.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("update error: " + ex.getMessage());
            return 0;
        }
    }
    
 
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablefx;

import java.util.List; // Fixed: Correct import for List
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author knmor
 */
public class DAO {
//      public void readAll() {
//        try {
//            Connection con = jdbc.Koneksi.getConnection();
//            Statement st = con.createStatement();
//            ResultSet rs = st.executeQuery("SELECT * FROM mahasiswa");
//            while (rs.next()) {
//                System.out.println("NIM : " + rs.getString("ID"));
//                System.out.print("Nama :");
//                System.out.println(rs.getString("nama"));
//                System.out.println("alamat : " + rs.getString("alamat"));
//            }
//        } catch (SQLException ex) {
//            System.err.println("read all error: " + ex.getMessage());
//        }
//    }

    public List<String[]> readAll() {
        List<String[]> dataList = new ArrayList<>();
        String sql = "SELECT ID, nama, alamat FROM mahasiswa";
        try (Connection con = Database.getConnection(); PreparedStatement pst = con.prepareStatement(sql); ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                String[] data = {
                    String.valueOf(rs.getInt("ID")),
                    rs.getString("nama"),
                    rs.getString("alamat")
                };
                dataList.add(data);
            }
        } catch (SQLException ex) {
            System.err.println("Read error: " + ex.getMessage());
        }
        return dataList;
    }

    public int insertOne(int nim, String nama, String alamat) {
        String sql = "INSERT INTO mahasiswa (ID, nama, alamat) VALUES (?, ?, ?)";
        try {
            Connection con = jdbc.Koneksi.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, nim);
            pst.setString(2, nama);
            pst.setString(3, alamat);

            return pst.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("Insert error: " + ex.getMessage());
            return 0;
        }
    }

    public int deleteById(int id) {
        String sql = "DELETE FROM mahasiswa WHERE ID = ?";
        try {
            Connection con = Database.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);

            return pst.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("Delete error: " + ex.getMessage());
            return 0;
        }
    }

    public int updateUserById(int id, String nama, String alamat) {
        String sql = "UPDATE mahasiswa SET nama = ?, alamat = ? WHERE ID = ?";
        try {
            Connection con = Database.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, nama);
            pst.setString(2, alamat);
            pst.setInt(3, id);

            return pst.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("Update error: " + ex.getMessage());
            return 0;
        }
    }
    
    public String[] findById(int nim) {
    String query = "SELECT nama, alamat FROM mahasiswa WHERE ID = ?";
    try (Connection conn = Database.getConnection();
         PreparedStatement stmt = conn.prepareStatement(query)) {
        stmt.setInt(1, nim);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            String[] data = {rs.getString("nama"), rs.getString("alamat")};
            return data;
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return null; // Return null if no record is found
}


}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package makanan;
import com.mysql.cj.jdbc.MysqlDataSource;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class Koneksi {
public static Connection con;
    public static Connection config() throws SQLException{
        MysqlDataSource dataSource = new MysqlDataSource();
        String DB_URL = "jdbc:mysql://localhost:3306/makanan";
        String DB_USERNAME = "root";
        String DB_PASSWORD = "";
        
        dataSource.setUrl(DB_URL);
        dataSource.setUser(DB_USERNAME);
        dataSource.setPassword(DB_PASSWORD);
        try{
            con = dataSource.getConnection();
            System.out.println("Koneksi Berhasil");
        } catch (SQLException ex){
            System.out.println("Eksepsi akses data : " + ex.getMessage());
        }
        return con;
    }
}
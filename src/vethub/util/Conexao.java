package vethub.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexao {
   
    private static String url = "jdbc:mysql://localhost:3306/vethub1?useSSL=false&serverTimezone=UTC"; 
    private static String user = "root";
    private static String password = "us3gw1pc45i1"; 
    
    
    public static Connection conectar(){
        Connection conn = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);
            
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha na conexão com o banco: "+ ex.getMessage());
        }
        
        return conn;
    }
    
    public static void desconectar(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                
            }
        }
    }
}
            

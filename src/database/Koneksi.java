package database;

import java.sql.*;
import javax.swing.JOptionPane;

public class Koneksi {

    private static Connection conn;

    //Koneksi Database
    public static Connection getConnection() throws SQLException {
	if (conn == null || !conn.isClosed()) {
	    try {
		String url = "jdbc:mysql://localhost:3306/db_app_tiketing"; //Sesuaikan Nama Database nya
		String user = "root";
		String password = "";
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		conn = (Connection) DriverManager.getConnection(url, user, password);
	    } catch (SQLException e) {
		System.out.println("Tidak Terhubung Ke Database" + e.getMessage());
		throw new SQLException("Gagal Menghubungkan Database", e);
	    }
	}
	return conn;
    }

    //Menutup Koneksi Database
    public static void closeConnection(Connection conn, PreparedStatement st, ResultSet rs) {
	try {
	    if (conn != null && !conn.isClosed()) {
		conn.close();
	    }
	    if (st != null) {
		st.close();
	    }
	    if (rs != null) {
		rs.close();
	    }
	} catch (SQLException e) {
	    JOptionPane.showMessageDialog(null, "Gagal Menutup Koneksi: " + e.getMessage());
	}
    }
}

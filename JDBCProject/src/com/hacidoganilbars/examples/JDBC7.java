package com.hacidoganilbars.examples;
//LIKE kullan�m ornek
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC7 {

	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/hastane";

	static final String USER = "root";
	static final String PASS = "8124782.Aa";

	public static void main(String[] args) {

		Connection connection = null;
		Statement statement = null;

		try {
			Class.forName(JDBC_DRIVER);
			connection = DriverManager.getConnection(DB_URL, USER, PASS);
			statement = connection.createStatement();

			String sql = "SELECT id, isim, soy_isim, yas FROM hastane_personel";
			ResultSet rs = statement.executeQuery(sql);
			while (rs.next()) {
				int id = rs.getInt("id");
				int yas = rs.getInt("yas");
				String isim = rs.getString("isim");
				String soyIsim = rs.getString("soy_isim");

				System.out.print(" ID: " + id);
				System.out.print(" �sim: " + isim);
				System.out.print(" Soy�sim: " + soyIsim);
				System.out.println(" Ya�: " + yas);
			}
			System.out.println();

			sql = "SELECT id, isim, soy_isim, yas FROM hastane_personel WHERE " 
			+ "isim LIKE '%n'";
			rs = statement.executeQuery(sql);
			while (rs.next()) {
				int id = rs.getInt("id");
				int yas = rs.getInt("yas");
				String isim = rs.getString("isim");
				String soyIsim = rs.getString("soy_isim");

				System.out.print(" ID: " + id);
				System.out.print(" �sim: " + isim);
				System.out.print(" Soy�sim: " + soyIsim);
				System.out.println(" Ya�: " + yas);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

package com.hacidoganilbars.examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//TABLODA VERÝ GÜNCELLEME
public class JDBC5 {
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
				System.out.print(" Ýsim: " + isim);
				System.out.print(" SoyÝsim: " + soyIsim);
				System.out.println(" Yaþ: " + yas);
			}

			// Güncelleme iþlemi
			sql = "UPDATE hastane_personel SET yas = 20 WHERE id = 106";
			// String sql = "UPDATE hastane_personel SET yas = 17 WHERE id in (106 , 101)";
			statement.executeUpdate(sql);
			System.out.println();
			sql = "SELECT id, isim, soy_isim, yas FROM hastane_personel";
			rs = statement.executeQuery(sql);
			while (rs.next()) {
				int id = rs.getInt("id");
				int yas = rs.getInt("yas");
				String isim = rs.getString("isim");
				String soyAd = rs.getString("soy_isim");

				System.out.print(" ID: " + id);
				System.out.print(" Ýsim: " + isim);
				System.out.print(" SoyÝsim: " + soyAd);
				System.out.println(" Yaþ: " + yas);
			}
			rs.close();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}

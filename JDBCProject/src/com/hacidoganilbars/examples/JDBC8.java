package com.hacidoganilbars.examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//DELETE KAYIT SÝLME YANÝ SATIR SÝLME TABLODAN
public class JDBC8 {
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
			System.out.println();

			// DELETE FROM KAYIT SÝLME DÝKKAT
			sql = "DELETE FROM hastane_personel WHERE id=106";
			statement.executeUpdate(sql);

			sql = "SELECT id, isim, soy_isim, yas FROM hastane_personel";
			rs = statement.executeQuery(sql);
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
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

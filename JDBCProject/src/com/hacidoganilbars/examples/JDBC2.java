package com.hacidoganilbars.examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
//TABLO OLUSTURMA ALANLARINI BELÝRLEME DÝKKAT!!
public class JDBC2 {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	// dikkat (DB_URL) en sona iþlem yapýlacak þema eklendi
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

			String sql = "CREATE TABLE hastane_personel ( id INTEGER not Null,"
					+ "isim VARCHAR(45), soy_isim VARCHAR(45), yas INTEGER, PRIMARY KEY (id))";
			statement.executeUpdate(sql);
			System.out.println("hastane_personel tablosu oluþturuldu!!!");

			connection.close();
			statement.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

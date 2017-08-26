package com.hacidoganilbars.examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
//TABLOYA VERÝLERÝ BASMA
public class JDBC3 {
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

			String sql = "INSERT INTO hastane_personel VALUES (105 , 'Hacý Doðan' , 'Ýlbars' , 30)";
			statement.executeUpdate(sql);
			sql = "INSERT INTO hastane_personel VALUES ( 101 , 'Hakan' , 'Ceylan' , 30 )";
			statement.executeUpdate(sql);
			sql = "INSERT INTO hastane_personel VALUES ( 102 , 'Hamza Fatih' , 'Sevim' , 24 )";
			statement.executeUpdate(sql);
			sql = "INSERT INTO hastane_personel VALUES ( 103 , 'Mustafa' , 'Gökkoyun' , 33)";
			statement.executeUpdate(sql);
			sql = "INSERT INTO hastane_personel VALUES ( 104 , 'Harun' , 'Demirci' , 19)";
			statement.executeUpdate(sql);
			sql = "INSERT INTO hastane_personel VALUES ( 106 , 'Ahmet' , 'Mehmet' , 19)";
			statement.executeUpdate(sql);

			System.out.println("Kayýtlar baþarýyla eklendi!!!");

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

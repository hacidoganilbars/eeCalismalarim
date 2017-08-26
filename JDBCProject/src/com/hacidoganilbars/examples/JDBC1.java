package com.hacidoganilbars.examples;
/*importlara dikkat java.sql.*
 *Ayr�ca mysql-connector-java... jar�n� y�klemeyi unutmay�n
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
//SCHEMA yani DATABASE olu�turma
public class JDBC1 {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/";
    
	//veritaban� kullan�c� ad� ve �ifresi
	//kendi sql kullan�c� ve �ifrenizi girin
	static final String USER = "root";
	static final String PASS = "8124782.Aa";

	public static void main(String[] args) {

		Connection connection = null;
		Statement statement = null;

		try {
			Class.forName(JDBC_DRIVER);
			connection = DriverManager.getConnection(DB_URL, USER, PASS);
			statement = connection.createStatement();

			String sql = "CREATE DATABASE hastane";
			statement.executeUpdate(sql);
			System.out.println("hastane database (schema) olu�turuldu!!!");
			
			statement.close();
			connection.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

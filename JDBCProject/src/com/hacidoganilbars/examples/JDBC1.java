package com.hacidoganilbars.examples;
/*importlara dikkat java.sql.*
 *Ayrýca mysql-connector-java... jarýný yüklemeyi unutmayýn
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
//SCHEMA yani DATABASE oluþturma
public class JDBC1 {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/";
    
	//veritabaný kullanýcý adý ve þifresi
	//kendi sql kullanýcý ve þifrenizi girin
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
			System.out.println("hastane database (schema) oluþturuldu!!!");
			
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

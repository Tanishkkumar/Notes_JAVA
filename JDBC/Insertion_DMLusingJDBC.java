package JDBC;

import java.sql.*;
  
public class Insertion_DMLusingJDBC {
	public static void main(String[] args) throws Exception {
		Class.forName("org.sqlite.JDBC");
		Connection con = DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ.db");
		Statement stm = con.createStatement();
		stm.executeUpdate("insert into dept values(80,'SCI')");
		stm.close();
		con.close();

	}
}

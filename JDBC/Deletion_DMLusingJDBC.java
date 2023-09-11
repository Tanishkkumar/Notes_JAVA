package JDBC;

import java.sql.*;

public class Deletion_DMLusingJDBC {
	public static void main(String[] args) throws Exception {
		Class.forName("org.sqlite.JDBC");
		Connection con = DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ.db");
		Statement stm = con.createStatement();
		stm.executeUpdate("delete from dept where deptno>=60");
		stm.close();
		con.close();

	}
}

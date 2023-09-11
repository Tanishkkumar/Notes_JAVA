package JDBC;

import java.sql.*;

public class Updation_DMLusingJDBC {
	public static void main(String[] args) throws Exception {
		Class.forName("org.sqlite.JDBC");
		Connection con = DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ.db");
		Statement stm = con.createStatement();
		stm.executeUpdate("update dept set dname='WTF' where deptno=40");
		stm.close();
		con.close();
	}
}

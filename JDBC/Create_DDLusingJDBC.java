package JDBC;

import java.sql.*;

public class Create_DDLusingJDBC {
	public static void main(String[] args) throws Exception {
		Class.forName("org.sqlite.JDBC");
		Connection con = DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ.db");
		Statement stm = con.createStatement();
		stm.execute("create table Temple(aa integer,b float)"); // contain two column.

		stm.close();
		con.close();
	}
}
 
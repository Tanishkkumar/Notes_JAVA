package JDBC;

import java.sql.*;

public class Drop_DDLusingJDBC {
	public static void main(String[] args) throws Exception {
		Class.forName("org.sqlite.JDBC");
		Connection con = DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ.db");
		Statement stm = con.createStatement();
		stm.execute("drop table Temple"); // delete the whole table named Temple.

		stm.close();
		con.close();
	}
}

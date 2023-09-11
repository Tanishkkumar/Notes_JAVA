package JDBC;

import java.sql.*;

public class Database2 {
	public static void main(String[] args) throws Exception {
		Class.forName("org.sqlite.JDBC");
		Connection con = DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ.db");
		Statement stm = con.createStatement();
		ResultSet rs = stm.executeQuery("select * from students");
		int r;
		String na, dep, ci;
		while (rs.next()) {
			r = rs.getInt("roll");
			na = rs.getString("name");
			ci = rs.getString("city");
			dep = rs.getString("deptno");
			System.out.println(r + " " + na + " " + ci + " " + dep);
		}
		 stm.close();
		rs.close();
		con.close();
	}
}

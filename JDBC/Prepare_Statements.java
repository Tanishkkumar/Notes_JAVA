package JDBC;

import java.sql.*;
import java.util.Scanner;

public class Prepare_Statements {
	public static void main(String[] args) throws Exception {
		Class.forName("org.sqlite.JDBC");
		Connection con = DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ.db");

		PreparedStatement stm = con.prepareStatement("select * from students where deptno=?"); // here ? is place holder
																								// sign.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the department number in the field");
		int dno = sc.nextInt();
		stm.setInt(1, dno); // setting placeholder by giving number and value

		ResultSet rs = stm.executeQuery();

		while (rs.next()) {
			System.out.print(rs.getInt("roll") + " ");
			System.out.print(rs.getString("name") + " ");
			System.out.print(rs.getString("city") + " ");
			System.out.print(rs.getInt(4) + " ");
			System.out.println();
		}
		stm.close();
		rs.close();
		con.close();
		sc.close();
	}
}

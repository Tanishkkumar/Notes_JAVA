package JDBC;

import java.sql.*;
import java.util.Scanner;

public class InsertUsing_Prepared_Statement {
	public static void main(String[] args) throws Exception {
		Class.forName("org.sqlite.JDBC");
		Connection con = DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ.db");
		PreparedStatement stm = con.prepareStatement("insert into students values(?,?,?,?)");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the student rollnumber");
		int r = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the student name");
		String na = sc.nextLine();
		System.out.println("Enter the student city");
		String ci = sc.next();
		sc.nextLine();
		System.out.println("Enter the student deptnumber");
		int dno = sc.nextInt();

		stm.setInt(1, r);
		stm.setString(2, na);
		stm.setString(3, ci);
		stm.setInt(4, dno);

		stm.executeUpdate();

		stm.close();
		con.close();
		sc.close();

	}
}

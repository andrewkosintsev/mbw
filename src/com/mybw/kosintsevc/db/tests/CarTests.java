package com.mybw.kosintsevc.db.tests;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CarTests {
	public static void main(String args[]) {
		String dbUrl = "jdbc:mysql://localhost:3306/mybwdb";
		String dbClass = "com.mysql.jdbc.Driver";
		String query = "select * from ALL_CARS";

		try {

			Class.forName(dbClass);
			Connection con = DriverManager.getConnection(dbUrl, "root",
					"P@ssw0rd");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);

			while (rs.next()) {
				System.out.println(rs.getString(1) + " " + rs.getString(2)
						+ " " + rs.getString(3));
			}
			con.close();
		}

		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		catch (SQLException e) {
			e.printStackTrace();
		}

	}
}

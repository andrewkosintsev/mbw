package com.mybw.kosintsevc.db.connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnector {
	public static void main(String args[]) {
		String dbUrl = "jdbc:mysql://localhost:3306/mybw";
		String dbClass = "com.mysql.jdbc.Driver";
		String query = "select * from USERS";

		try {

			Class.forName(dbClass);
			Connection con = DriverManager.getConnection(dbUrl, "root",
					"P@ssw0rd");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);

			while (rs.next()) {
				System.out.println(rs.getString(1) + " " + rs.getString(2)
						+ " " + rs.getString(3) + " " + rs.getString(4) + " "
						+ rs.getString(5) + " " + rs.getString(6) + " "
						+ rs.getString(7) + " " + rs.getString(8) + " "
						+ rs.getString(9) + " " + rs.getString(10) + " "
						+ rs.getString(11) + " " + rs.getString(12) + " "
						+ rs.getString(13));
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

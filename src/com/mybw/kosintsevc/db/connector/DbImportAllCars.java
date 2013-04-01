package com.mybw.kosintsevc.db.connector;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbImportAllCars {
	public static void main(String args[]) {
		String dbUrl = "jdbc:mysql://localhost:3306/mybwdb";
		String dbClass = "com.mysql.jdbc.Driver";
		String query = "INSERT INTO mybw_cars (CAR_ID,CAR_NAME) VALUES(INDEX,'MAIN');";

		try {

			Class.forName(dbClass);
			Connection con = DriverManager.getConnection(dbUrl, "root",
					"P@ssw0rd");
			Statement stmt = con.createStatement();
			FileReader reader = null;
			try {
				reader = new FileReader(new File("marks.txt"));
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
			BufferedReader read = new BufferedReader(reader);
			String newStr;
			int index = 1;
			try {
				while ((newStr = read.readLine()) != null) {
					String str = query;
					String tempQuery = str.replace("INDEX",
							String.valueOf(index));
					tempQuery = tempQuery.replace("MAIN", newStr);
					stmt.executeUpdate(tempQuery);
					index++;
				}
			} catch (IOException e) {
				e.printStackTrace();
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

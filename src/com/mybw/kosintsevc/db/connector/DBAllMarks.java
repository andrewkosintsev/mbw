package com.mybw.kosintsevc.db.connector;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBAllMarks {
	public static void main(String args[]) {
		String dbUrl = "jdbc:mysql://localhost:3306/mybwdb";
		String dbClass = "com.mysql.jdbc.Driver";
		String query = "INSERT INTO all_cars (MARK_ID, MARK_NAME,CAR_NAME) VALUES(INDEX,'MAIN','FIX');";
		String selectFrom = "SELECT * FROM mybw_cars WHERE car_id = ?;";

		try {

			Class.forName(dbClass);
			Connection con = DriverManager.getConnection(dbUrl, "root",
					"P@ssw0rd");
			Statement stmt = con.createStatement();
			FileReader readerCars = null;
			try {
				readerCars = new FileReader(new File("spisok.txt"));
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
			BufferedReader read2 = new BufferedReader(readerCars);
			String newStr;
			int index = 462;
			try {
				while ((newStr = read2.readLine()) != null) {
					for (int i = 1; i < 89; i++) {
						String sttt = selectFrom;
						ResultSet rs = stmt.executeQuery(sttt.replace("?",
								String.valueOf(i)));
						rs.next();
						String car = rs.getString(2);
						if (newStr.contains(car.trim())) {
							String str = query;
							String tempQuery = str.replace("INDEX",
									String.valueOf(index));
							tempQuery = tempQuery.replace("MAIN", newStr
									.replace(car.trim(), "").trim());
							tempQuery = tempQuery.replace("FIX", car.trim());
							stmt.executeUpdate(tempQuery);
							break;
						}
					}
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

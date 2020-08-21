package com.hg.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {
	public static void main(String[] args) {
		Connection con = null;
		Statement stat = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/db5?serverTimezone=Asia/Shanghai","root","root");
			stat = con.createStatement();
			String sql = "select * from account";
			ResultSet res = stat.executeQuery(sql);
			while(res.next()) {
				int id = res.getInt(1);
				String str = res.getString(2);
				Double balance = res.getDouble(3);
				System.out.println(id+":::"+str+":::"+balance);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(stat!=null) {
				try {
					stat.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}

package com.ltts.PrakharRastogi_99004321.configure;

import java.sql.Connection;
import java.sql.DriverManager;
public class MovieConfig {
	public static Connection getConnection() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/gen","root","spacemarines");
		return c;
}
}

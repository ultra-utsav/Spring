package com.uv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = { "classpath:db.properties" })
public class JDBCConnection {

	@Value("${jdbc.driver}")
	private String driver;

	@Value("${jdbc.url}")
	private String url;

	@Value("${jdbc.username}")
	private String username;

	@Value("${jdbc.password}")
	private String password;

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Statement getConnection() {
		ResultSet rs = null;
		try {
			Class.forName(driver);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			// System.out.println(driver);
			System.out.println(e);
		}
		Connection con = null;
		try {
			con = DriverManager.getConnection(url,username,password);
			
			
		} catch (SQLException e) {
			System.out.println(e);
		}
		Statement st = null;
		try {
			st = con.createStatement();
		} catch (SQLException e) {
			System.out.println(e);
		}
		return st;
	}
}

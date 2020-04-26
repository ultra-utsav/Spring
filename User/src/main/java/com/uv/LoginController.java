package com.uv;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	@Autowired
	JDBCConnection jdbc;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(HttpServletRequest request, HttpServletResponse response, Model m) {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		Statement st = jdbc.getConnection();
		boolean flag = false;
		try {
			ResultSet rs = st.executeQuery("select * from user where name='" + username + "';");
			while (rs.next()) {
				if (password.equals(rs.getString(4))) {
					flag = true;
					m.addAttribute("object", new ArrayList<String>(
							Arrays.asList(Integer.toString(rs.getInt(1)), rs.getString(2), rs.getString(3))));
					break;
				}
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
		if (flag) {
			HttpSession session = request.getSession();
			session.setAttribute("user", username);
			return "profile";
		} else {
			return "login";
		}
	}
}

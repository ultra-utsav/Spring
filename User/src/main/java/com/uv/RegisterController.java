package com.uv;

import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegisterController {
	
	@Autowired
	JDBCConnection jdbc;

	@RequestMapping(value = "/registerPage", method = RequestMethod.POST)
	public String registerRedirect(@ModelAttribute("user") User user,Model m) {
		return "register";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(@ModelAttribute("user")User user,Model m) throws ClassNotFoundException, SQLException {
		int rs = 0;
		System.out.print("in register before");
		System.out.println(user.toString());
		System.out.print("in register after");
		String password;
		try {
			if (user.getPassword1().equals(user.getPassword2())) {
				password = user.getPassword1();
			} else {
				return "register";
			}
			Statement st = jdbc.getConnection();
			String query = "insert into user values (" + user.getId() + ",'" + user.getName() + "','"
					+ user.getCollege() + "','" + user.getPassword1() + "');";
			rs = st.executeUpdate(query);

		} catch (Exception e) {
			System.out.println(e);
		}

		return "register";

	}
}

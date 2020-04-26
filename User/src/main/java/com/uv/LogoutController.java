package com.uv;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LogoutController {

	@RequestMapping(value="logout",method=RequestMethod.POST)
	public String logout(HttpServletRequest request,HttpServletResponse response)
	{
		HttpSession session = request.getSession();
		session.removeAttribute("user");
		return "login";
	}
}

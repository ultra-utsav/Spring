package com.uv;

public class User {
	private int id = 0;
	private String name = "name";
	private String college = "college";
	private String password1 = "password";
	private String password2 = "password";

	public int getId() {
		return id;
	}

	public String getPassword2() {
		return password2;
	}

	public void setPassword2(String password2) {
		this.password2 = password2;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getPassword1() {
		return password1;
	}

	public void setPassword1(String password1) {
		this.password1 = password1;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", college=" + college + ", password1=" + password1
				+ ", password2=" + password2 + "]";
	}

}

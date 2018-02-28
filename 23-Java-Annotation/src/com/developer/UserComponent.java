package com.developer;

import com.vendor.RequestMapping;

@RequestMapping(url = "/user")
public class UserComponent {

	@RequestMapping(url = "/register")
	public void doRegister() {
		System.out.println("register.....");
	}

	@RequestMapping(url = "/login")
	public void doLogin(String userName, String password) {
		System.out.println("login....." + userName + " " + password);
	}

}

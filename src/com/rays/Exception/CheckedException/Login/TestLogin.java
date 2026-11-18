package com.rays.Exception.CheckedException.Login;

public class TestLogin {
	public static void main(String[] args) {
		String login="nidhi";
		
		try {
			if(login.equals("admin")) {
				System.out.println("Login Successful");
			}else {
				System.out.println("Login Id invalild");
				throw new LoginException();
			}
		} catch (LoginException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}

package com.Collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class EnterPin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> username = new ArrayList<String>();
		ArrayList<String> password = new ArrayList<String>();
		
		username.add("alpha");
		password.add("alpha123");
		
		username.add("beta");
		password.add("beta789");
		
		username.add("gama");
		password.add("gama456");
		
		System.out.println(username);
		System.out.println(password);
		
		System.out.println("Enter your username : ");
		String user = sc.next();
		for(int i = 0;i < username.size();i++) {
			if (user.equals(username.get(i))) {	
				System.out.println("Enter your password : ");
				String pass = sc.next();
				
				if (pass.equals(password.get(i))) {
					System.out.println("login successful");
					return;
				}else {
					System.out.println("password is incorrect");
					return;
				}	
			}	
		}
		System.out.println("Invalid username has been enter");
	}
}

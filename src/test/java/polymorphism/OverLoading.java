package polymorphism;

import java.util.Scanner;

public class OverLoading {

	public void emailandphone(Object value) {
		System.out.println("successful login by using email");
	}
	public void emailandphone(long phone) {
		System.out.println("successful login by using phone");
	}
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your email or phone number");
		String str = sc.nextLine();
		
		Object value;
		try {
			value = Long.parseLong(str);
		}catch (NumberFormatException e) {
			value = str;
		}
		
		OverLoading ol = new OverLoading();
		ol.emailandphone(value);

	}

}

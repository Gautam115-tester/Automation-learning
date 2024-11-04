package paramcons;

import java.util.Scanner;

public class Operator {

	 int a , b;
	
	public Operator(int a , int b) {
		this.a = a;
		this.b = b;
		System.out.println("Choose your operator : \n1.Add\n2.Sub\n3.Multi\n4.Div");
	}
	public void Display(int op) {
		switch (op) {
		case 1:
			System.out.println("Add of 2 var is "+(a+b));
			break;
		case 2:
			System.out.println("Sub of 2 var is "+(a-b));
			break;
		case 3:
			System.out.println("Multi of 2 var is "+(a*b));
			break;
		case 4:
			System.out.println("Div of 2 var is "+((float)a/b));
			break;

		default:
			System.out.println("Invalid operator");
			break;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of A : ");
		int a = sc.nextInt();
		System.out.println("Enter value of B : ");
		int b = sc.nextInt();
		Operator o = new Operator(a, b);
		int op = sc.nextInt();
		o.Display(op);
		

	}

}

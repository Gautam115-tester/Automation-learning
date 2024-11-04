package defcons;

public class Myclass {
	private String message;
	public Myclass() {
		this.message = "This Default Constructor class";
	}
	
	public void printmessage() {
		System.out.println(this.message);
	}
	
	public static void main(String[] args) {
		
		Myclass obj = new Myclass();
		obj.printmessage();

	}

}

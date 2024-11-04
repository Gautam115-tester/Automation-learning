package defcons;

public class Student {
     String name;
     int age;
     String department;
//     default constructor.
	public Student() {
		this.name = "xyz";
		this.age = 50;
		this.department = "Information and Technology";
	}
	
	public void displayDetails() {
		System.out.println("Name of the person is "+name);
		System.out.println("Age of the person is "+age);
		System.out.println("Department of the person is "+department);
	}

	public static void main(String[] args) {
		
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.displayDetails();
		s2.displayDetails();
		
		s1.name = "abc";
		s1.age = 40;
		
		System.out.println();
		
		s1.displayDetails();
		s2.displayDetails();

	}

}

package paramcons;
public class Student {
	private String name;
	private int age;
	private double gpa;
	
	public Student(String name,int age,double gpa) {
		this.name = name;
		this.age = age;
		this.gpa = gpa;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public void display() {
		System.out.println("Name of the person is "+name);
		System.out.println("Age of the person is "+age);
		System.out.println("gpa of the person is "+gpa);
	}
	public static void main(String[] args) {
		Student s1 = new Student("xyz", 18, 8.75);
		Student s2 = new Student("Abc", 20, 7.56);
		s1.display();
		System.out.println();
		s2.display();
	}
}

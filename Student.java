package calci;
import java.util.Scanner;


class Student{
	String name;
	int marks;
	int Rollno;
	int m1;
	int m2;
	int m3;
	public int getM1() {
		return m1;
	}
	public void setM1(int m1) {
		this.m1 = m1;
	}
	public int getM2() {
		return m2;
	}
	public void setM2(int m2) {
		this.m2 = m2;
	}
	public int getM3() {
		return m3;
	}
	public void setM3(int m3) {
		this.m3 = m3;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getRollno() {
		return Rollno;
	}
	public void setRollno(int rollno) {
		Rollno = rollno;
	}
	public Student(String name, int marks, int rollno) {
		super();
		this.name = name;
		this.marks = marks;
		Rollno = rollno;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name:");
		this.name=sc.nextLine();
		
		System.out.println("Enter Rollno:");
		int Rollno=sc.nextInt();
		
		System.out.println("Enter Marks of Subject 1:");
		this.m1=sc.nextInt();
		
		System.out.println("Enter Marks of Subject 2:");
		this.m2=sc.nextInt();
		
		System.out.println("Enter Marks of Subject 3:");
		this.m3=sc.nextInt();
	}
	
	void display() {
		int total=this.m1+this.m2+this.m3;
		double avg=total/3;
		double percent=(avg*100)/150;
		
		System.out.println("Name:"+this.name);
		System.out.println("Average:"+avg);
		System.out.println("Percentage:"+percent);
		
	}
	
}

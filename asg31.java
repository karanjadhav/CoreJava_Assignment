import java.util.Scanner;

class Student{
	private int rno;
	private String name;
	Student(){}
	void setData(int rno,String name){
		this.rno = rno;
		this.name = name;
	}
	void showData(){
		System.out.println("Roll no. : " + rno + "   Name : " + name);
		}
}

class StudentDemo{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		Student s1 = new Student();
		System.out.println("Enter Roll no. : ");
		int rno = sc.nextInt();
		System.out.println("Enter Name : ");
		String name = sc.next();
		s1.setData(rno,name);
		s1.showData();
	}
}
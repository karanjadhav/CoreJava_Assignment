import java.util.Scanner;

class Student{
	private String name;
	private int rollno;
	private int age;
	private int score;

	Student(){
		
		name = "";
		rollno = age = score = 0;
	}
	
	Student(String name,int rollno,int age, int score){
		
		this.name = name;
		this.rollno = rollno;
		this.age = age;
		this.score = score;
	}
	
	void setData(String name,int rollno,int age,int score){
		
		this.name = name;
		this.rollno = rollno;
		this.age = age;
		this.score = score;
	}
	 int getScore(){
		return score;
	}	

	void display(){
		
		System.out.println("Name : "+name+"\nRoll No. : "+rollno+"\nAge : "+age+"\nMarks Scored : "+score+"\n ");
	}
}

class StudentDemo{

	public static void main(String []args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of Students : ");
		int no = sc.nextInt();
		Student arr[] = new Student[no];
		for(int i=0;i<no;i++){
			arr[i] = new Student();
			System.out.print("\nEnter Name : ");
			String name = sc.next();
			System.out.print("Enter Roll No. : ");
			int rollno = sc.nextInt();
			System.out.print("Enter Age : ");
			int age = sc.nextInt();
			System.out.print("Enter Marks Scored :");
			int score = sc.nextInt();
			arr[i].setData(name,rollno,age,score);
		}


		
		System.out.println("\nStudents with Marks 0-50 :");	
		for(Student i : arr){
			if(i.getScore() <= 50){
				i.display();
			}
		}
		
		System.out.println("\nStudents with Marks 51-65 :");
		for(Student i : arr){
			if(i.getScore() > 50 && i.getScore() <= 65 ){
				i.display();
			}
		}

		System.out.println("\nStudents with Marks 66-80 :");	
		for(Student i : arr){
			if(i.getScore() > 65 && i.getScore() <= 80){
				i.display();
			}
		}
		
		System.out.println("\nStudents with Marks 81-100 :");	
		for(Student i : arr){
			if(i.getScore() > 80 ){
				i.display();
			}
		}

	}
}
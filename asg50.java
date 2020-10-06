package Asg50;
import java.util.Scanner;

class Employee {
	private int empId;
	private String  name;
	private double salary;
	Employee(int empId,String name,double salary){
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public boolean equals(Employee E1) {
		if(E1.getEmpId() == this.empId ) {
			return true;
		}
		else
			return false;
	}
	public String toString() {
		String str = "{ EmpId : "+this.getEmpId()+"\n Name : "+this.getName()+"\n Salary : "+this.getSalary()+"  },\n";
		return str;
	}
}



public class q50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Employee No : ");
		int no = sc.nextInt();
		
		Employee []arr = new Employee[no];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter "+(i+1)+"th Employee Details : ");
			System.out.print("EmpId : ");
			int emp = sc.nextInt();
			System.out.print("Name : ");
			String str = sc.next();
			System.out.print("Salary : ");
			double sal = sc.nextDouble();
			arr[i] = new Employee(emp,str,sal);
			for (int j = 0; j < i ; j++) {
				if(arr[i].equals(arr[j])) {
					i--;
					System.out.println("Double Employee ID Entry!!! \nEnter Details again :\n");
					break;
				}
			}
		}
		System.out.println("\n[ ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].toString());
			
		}
		System.out.println("  ]");
		sc.close();
		
		

	}

}
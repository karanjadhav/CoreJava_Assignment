import java.util.Scanner;

class Employee{
	
	private int empNo;
	private double salary;
	private static double totalSalary;
	// static double totalSalary;
	Employee(double salary){
		
		this.salary = salary;
		totalSalary += salary;
	}
	void displayEmployee(){
		
		System.out.println("\nEmployee No. : " + empNo + "  Salary : " + salary);
	}
	void setEmpNo(int i){
		empNo = i;
	}

	static void  displayTotalSalary(){
		System.out.println("\nTotal Salary : " + totalSalary);
	}
}

class EmployeeDemo{
	
	public static void main(String []args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Total Employee : ");
		int no = sc.nextInt();
		Employee arr[] = new Employee[no];
		for(int i=0;i<no;i++){
			
			System.out.println("Enter Salary for "+(i+1)+"th Employee : " );
			double str = sc.nextDouble();
			arr[i] = new Employee(str);
			arr[i].setEmpNo(i+1);
		}


		for(Employee i : arr){
			
			i.displayEmployee();
		}
		Employee.displayTotalSalary();
		//Employee.totalSalary;
	}
}
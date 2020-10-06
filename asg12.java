import java.util.Scanner;

class EmployeeSalary{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee's salary : ");	
		double Salary = sc.nextDouble();
		double HRA;
		double DA;
		HRA=0;
		DA=0;
		if(Salary < 1000){
			HRA = 0.1*Salary;
			DA = 0.9*Salary;
		}
		else if(Salary >= 1000){
			HRA = 2000;
			DA = 0.98*Salary;
		}
		double GrossSal = Salary + DA + HRA;
		System.out.println("Employee's Gross Salary is : "+GrossSal);
		}
}
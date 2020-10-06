import java.util.Scanner; 

class asg7 {

	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the marks of the subjects");
	int s1 = sc.nextInt();
	int s2 = sc.nextInt();
	int s3 = sc.nextInt();
	int s4 = sc.nextInt();
	int s5 = sc.nextInt();
	double sum = s1+s2+s3+s4+s5;
	System.out.println("Sum = " +sum);
	double percentage = (sum*100)/500;
	System.out.println("percentage marks = " +percentage+ "%" );    
	}
}
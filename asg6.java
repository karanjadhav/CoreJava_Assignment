import java.util.*;
class asg6 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius : ");
		int r = sc.nextInt();
		float pi=3.142F;
		double a= 2*pi*r*r;
		double c=2*pi*r;
		System.out.printf("Area = %.3f \n" ,a);
		System.out.printf("Circumfurence = %.3f" ,c);
	}
}
import java.util.Scanner;

abstract class Processor{
	
		int data ;
		
		void showData(){
		
			System.out.println("Data : "+data);
		}
	
		abstract double process(int n);
}

class Factorial extends Processor{
		double process(int n){
			double fact = 1;
			for(int i=1;i<=n;i++){
				fact*=i;
			}
			this.data = n;
			return fact;
		}
}

class Circle extends Processor{
	double process(int n){
		data = n;
		return (22/7)*(n*n);
	}
}

class Demo {
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.print("For Factorial press : 'f'\nFor Circle Area : 'a'\nEnter Choice : ");
		char ch = sc.next().charAt(0);
		switch(ch){
			case 'f' : 
				System.out.print("Enter the no. : ");
				int n = sc.nextInt();
				Processor p1 = new Factorial();
				double n3 = p1.process(n);
				System.out.println("Data : "+p1.data+"\nFactorial : "+n3);
				break;
			case 'a' : 
				System.out.print("Enter the no. : ");
				int n1 = sc.nextInt();
				Processor p2 = new Circle();
				double n4 = p2.process(n1);
				System.out.println("Data : "+p2.data+"\nArea of Circle : "+n4);
				break;
			default:
				System.out.println("Invalid Choice");
				break;
		}
	}
}
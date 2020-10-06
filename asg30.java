import java.util.Scanner;

class CalculateDiagonal {
	public static void main(String []args){
			System.out.println("Enter size of 2D Array : ");
			Scanner sc = new Scanner(System.in);
			int row = sc.nextInt();
			System.out.println("Enter Array of Elements : ");
			int arr[][] = new int[row][row];
			for(int i=0;i<row;i++){
				for(int j=0;j<row;j++){
					arr[i][j] = sc.nextInt();
				}
			}
			int sum=0;
			for(int i=0;i<row;i++){
				sum+=arr[i][i];
			}
			System.out.println("Sum of Diagonal Element is : " + sum);
		}
}
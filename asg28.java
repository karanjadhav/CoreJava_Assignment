import java.util.Scanner;

class ArrayString {
	public static void main(String []args){
		System.out.println("Enter size of Array ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String []str = new String[n];
		for(int i=0;i<n;i++){
			str[i] = sc.next();
		}
		for(String s : str){
			System.out.println(s);
		}
	}
}
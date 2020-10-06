package asg53;

import java.util.Scanner;

public class asg53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		String[] st = str.split(",\\s");  //", "
		int[] arr = new int[st.length];
		for (int i = 0; i < st.length; i++) {
			arr[i] = Integer.parseInt(st[i]);
			
		}
		for (int i : arr) {
			System.out.println(i);
		}
		sc.close();
	
	}

}
package asg55;

import java.util.Scanner;

public class asg55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.nextLine();
		String []arr = str.split("[\\s]+");
		System.out.println("No of Words : "+arr.length);
		int count = 1;
		str.trim();
		char ch = str.charAt(0);
		for (int i = 1; i < str.length(); i++) {
			if(str.charAt(i) == ' ' && ch != ' ') {
				count++;
				
			}
			ch = str.charAt(i);
		}
		System.out.println("\nNo of Words : "+count);
		sc.close();
	}

}
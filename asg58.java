package asg58;

import java.util.Scanner;

public class asg58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []week = { "Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		while(flag) {
			try {
				System.out.println("Enter no from 0-6 :\nEnter 8 to EXIT");
				int i = sc.nextInt();
				if(i == 8) {
					break;
				}
				System.out.println("You choose is : "+week[i]);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
			
		}
		sc.close();
	}

}
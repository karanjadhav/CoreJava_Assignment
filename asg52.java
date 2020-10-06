package Asg52;

import java.util.Scanner;

public class asg52 {
	
	static int countVowel(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			switch(str.charAt(i)) {
			case 'a' :
					count++;
					break;
			case 'e' :
				count++;
				break;
			case 'i' :
				count++;
				break;
			case 'o' :
				count++;
				break;
			case 'u' :
				count++;
				break;
			default:
				break;
					
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Name : ");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		name = name.toLowerCase();
		System.out.println("No. of Vowel : "+countVowel(name));
		sc.close();
	}

}

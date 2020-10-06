package asg61;

import java.util.Scanner;

class MyThread extends Thread {
	int num;
	
	public MyThread(int num) {
		super();
		this.num = num;
	}

	public void run() {
		for(int i=1;i<=num;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print("*"+" ");
		}
		System.out.println("\nEND");
	}
}

public class asg61 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		MyThread m = new MyThread(n);
		m.start();
	}

}
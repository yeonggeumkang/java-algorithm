package ch01.part01.main;

import java.util.Scanner;

public class SumForPos {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		do {
			System.out.print("n 입력 : ");
			n = stdIn.nextInt();
		} while (n<=0);
		
		int sum = 0;
		for(int i=0;i<=n;i++) {
			sum+=i;
		}
		System.out.println("합은 "+sum);
	}
}

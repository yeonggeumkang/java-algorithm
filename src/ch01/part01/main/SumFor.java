package ch01.part01.main;

import java.util.Scanner;

public class SumFor {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합은?");
		System.out.print("n의값 : ");
		int n = stdIn.nextInt();
		
		int sum = 0;
		for(int i=1; i<=n; i++) {
			sum += i;
		}
		System.out.println("합은?"+sum);
	}
}

package ch01.part01.main;

import java.util.Scanner;

public class ex08 {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int sum = 0;
		
		if(n%2==0) {
			int k = n/2;
			sum = (1+n)*k ;
		} else {
			int k = n/2;
			sum = (1+n)*k + (k+1);
			//System.out.println(k);
		}
		System.out.println(sum);
	}
}

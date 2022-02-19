package ch01.part01.main;

import java.util.Scanner;

public class ex11 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("입력 : ");
		int n = stdIn.nextInt();
		
		String str = Integer.toString(n);
		System.out.println(str.length());
		
	}
}

package ch01.part01.main;

import java.util.Scanner;

public class TriangleLB {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("길이 입력 : ");
		int n = stdIn.nextInt();
		
		for(int i=1;i<=n;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
}

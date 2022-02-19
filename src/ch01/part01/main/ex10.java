package ch01.part01.main;

import java.util.Scanner;

public class ex10 {	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("a 입력 : ");
		int a = stdIn.nextInt();
		System.out.print("b 입력 : ");
		int b = stdIn.nextInt();
		
		while(b<a) {
			System.out.println("a보다 큰 값을 입력하세요!");
			System.out.print("b 입력 : ");
			b = stdIn.nextInt();
		} 
		
		int answer = b-a;
		System.out.println("b-a는 "+ answer + "입니다.");
	}
}

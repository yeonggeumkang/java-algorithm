package ch02;

import java.util.Scanner;

public class ReserveArray {
	
	//배열 요소 a[idx1]과 a[idx2]의 값을 바꿈
	static void swap(int[] a, int idx1, int idx2) {
		int temp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = temp;
	}
	
	//배열a의 요소를 역순으로 정렬
	static void reverse(int[] a) {
		for (int i=0; i<a.length/2;i++) {
			swap(a,i,a.length-1-i);
		}
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("배열의 길이 : ");
		int num = stdIn.nextInt();
		
		int[] x = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = stdIn.nextInt();
		}
		
		reverse(x);
		
		System.out.println("배열을 역순으로 정렬 ");
		for(int i=0; i<num; i++) {
			System.out.println("x["+i+"] = "+x[i]);
		}
	}
}

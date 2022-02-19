package ch03;

import java.util.Scanner;

public class SeqSearch {
	static int seqSearch(int[] a, int key) {
		//int i=0;
		int n = a.length;
		
//		while(true) {
//			if(i==n) {
//				return -1;
//			}
//			if(a[i]==key) {
//				return i;
//			}
//			i++;
//		}
		
		for(int i=0; i<n; i++) {
			if(a[i]==key) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner stdIn = new Scanner(System.in);
		int[] x = {1,3,7,4,99,100,55,2};
		
		System.out.print("검색할 값 : ");
		int ky = stdIn.nextInt();
		int idx = seqSearch(x,ky);
		
		if(idx==-1) {
			System.out.println("없");
		}else {
			System.out.println("idx = "+idx);
		}
		
		
	}
}

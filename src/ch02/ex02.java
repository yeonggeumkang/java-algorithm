package ch02;

import java.util.Scanner;

public class ex02 {

	//배열 요소 a[idx1]과 a[idx2]의 값을 바꿈
		static void swap(int[] a, int idx1, int idx2) {
			System.out.println("a["+idx1+"] 와 a["+idx2+"]를 교환합니다. ");
			int temp = a[idx1];
			a[idx1] = a[idx2];
			a[idx2] = temp;
		}
		
		//배열a의 요소를 역순으로 정렬
		static void reverse(int[] a) {
			for (int i=0; i<a.length/2;i++) {
				for(int j=0; j<a.length; j++) {
					System.out.print(a[j]+" ");
				}
				System.out.println();
				swap(a,i,a.length-1-i);
			}
			for(int j=0; j<a.length; j++) {
				System.out.print(a[j]+" ");
			}
			System.out.println();		
			System.out.println("역순 정렬을 마쳤습니다. ");
		}
		
		@SuppressWarnings("resource")
		public static void main(String[] args) {
			@SuppressWarnings("unused")
			Scanner stdIn = new Scanner(System.in);

			
			int[] x = {5, 10, 73, 2, -5, 42};

			
			
			//System.out.println("배열을 역순으로 정렬 ");
			reverse(x);
			
			
		}
}

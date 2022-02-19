package ch03;

import java.util.Scanner;

public class BinarySearch {
	
	static int binSearch(int[] a, int key) {
		int pl = 0;
		int pr = a.length - 1;
		
		do {
			int pc = (pl+pr)/2;
			
			if (a[pc] == key) {
				return pc;
			} else if (a[pc]<key) {
				pl = pc+1;
			} else {
				pr = pc-1;
			}
			System.out.println(pl+" "+pc+" "+pr);
		} while (pl<=pr);
		
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int[] x = {1,3,6,7,8,10,13,17,20,25,55,99,101};
		
		System.out.print("검색할 값 : ");
		int key = stdIn.nextInt();
		
		int idx = binSearch(x,key);
		if(idx==-1) {
			System.out.println("어ㅂㅅ어 아아아 ");
		}else {
			System.out.println("index : "+idx);
		}
	}
}

package ch02;

public class ex03 {
	
	static int sumOf(int[] a) {
		int sum = 0;
		
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,30,204,1,3};
		System.out.println(sumOf(arr));
	}
}

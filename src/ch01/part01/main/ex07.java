package ch01.part01.main;

public class ex07 {
	/** 1부터 n까지의 합 : 함수 */
	static void ex07(int n) {
		int sum = 0;
		for(int i=1; i<n; i++) {
			System.out.print(i+" + ");
			sum += i;
		}
		sum+=n;
		System.out.print(n+" = "+sum);
	}
	
	public static void main(String[] args) {
		
		ex07(7);
	}
}

package ch01.part01.main;

public class ex09 {
	
	static int sumof(int a, int b) {
		int sum = 0;
		int x,y;
		
		if (a<b) {
			x=a; y=b;
		} else {
			x=b; y=a;
		}
		
		for(int i=x; i<=y; i++) {
			sum+=i;
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(sumof(1,10));
	}
}

package ch01.part01.main;

public class Max3m {
	
	/** a,b,c의 최댓값 구하여 반환하는 함수*/
	static int max3(int a, int b, int c) {
		int max = a;
		if(b>max) max = b;
		if(c>max) max = c;
		return max;
	}
	
	public static void main(String[] args) {
		System.out.println(max3(3,2,1));
	}
}

package ch01.part01.main;

public class ex17 {
	static void npira(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		npira(3);
	}
}

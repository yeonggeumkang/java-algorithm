package ch02;

public class PhysicalExam {
	
	static final int VMAX = 21;
	
	static class PhyscData {
		String	name;
		int		height;
		double	vision;
		
		//생성자
		PhyscData(String name, int height, double vision){
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
	}
	
	//키 평균구하기
	static double aveHeight(PhyscData[] dat) {
		double sum = 0;
		
		for(int i=0; i<dat.length; i++) {
			sum += dat[i].height;
		}
		return sum/dat.length;
	}
	
	public static void main(String[] args) {
//		Scanner stdIn = new Scanner(System.in);
		
		PhyscData[] x = {
				new PhyscData("박현규",162,0.3),
				new PhyscData("함진아",162,0.3),
				new PhyscData("최윤미",162,0.3),
				new PhyscData("홍연의",162,0.3),
				new PhyscData("이수진",162,0.3),
				new PhyscData("김영준",162,0.3),
				new PhyscData("박용",162,0.3)
		};
		//int[] vdist = new int[VMAX];
	
		System.out.println("평균키 : "+aveHeight(x));
	}
	
}

package ch03;

class Id {
	private static int counter = 0;
	private int id;
	
	//생성자
	public Id() {
		id = ++counter;
	}
	
	public int getId() { return id; }
	
	public static int getCounter() { return counter; }
	
	public int getCounter2() { return counter; }
	
	
}
public class IdTester {
	public static void main(String[] args) {
		Id a = new Id();
		Id b = new Id();
		
		System.out.println(a.getId());
		
		
		System.out.println(Id.getCounter());
		
		System.out.println(a.getCounter2());
		
		System.out.println(b.getId());
		System.out.println(b.getCounter2());
	}
}

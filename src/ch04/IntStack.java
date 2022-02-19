package ch04;

public class IntStack {
	private int max; 	//스택 용량
	private int ptr;	// stack pointer
	private int[] stk;	// stack 본체
	
	// 실행 시 예외 - 스택 비어있음
	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() {}
	}
	
	public class OverflowIntStackException extends RuntimeException {
		public OverflowIntStackException() {}
	}
	
	public IntStack(int capacity) {
		ptr = 0;
		max = capacity;
		try {
			stk = new int[max];
		} catch(OutOfMemoryError e) {
			max = 0;
		}
	}
	
	public int push(int x) throws OverflowIntStackException {
		if(ptr>=max) 
			throw new OverflowIntStackException();
		return stk[ptr++]=x;
	}
	
	public int pop() throws EmptyIntStackException {
		if (ptr<=0) 
			throw new EmptyIntStackException();
		return stk[--ptr];
	}
	
	public int peep() throws EmptyIntStackException {
		if(ptr<=0)
			throw new EmptyIntStackException();
		return stk[ptr-1];
	}
	
	
}

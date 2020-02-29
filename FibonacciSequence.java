
public class FibonacciSequence {
	public int fib(int entryN) {
		int fib[] = new int[entryN+2];
		fib[0] = 0;
		fib[1] = 1;
		
		for(int i=2;i<=entryN;i++){
			fib[i] = fib[i-1] + fib[i-2];
		}
		
		return fib[entryN];
	}
}

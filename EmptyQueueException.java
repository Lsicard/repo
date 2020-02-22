
public class EmptyQueueException extends Exception{
	EmptyQueueException(){
		super("Error: Cannot remove head queue entry from an empty queue.\n");
	}
}

import java.util.LinkedList;

public class LinkedQueue<T> implements QueueInterface<T> {
	private LinkedList<T> linkedQueue = new LinkedList<T>();
	@Override
	public void enqueue(T newEntry) {
		this.linkedQueue.add(newEntry);
	}

	@Override
	public T dequeue() throws EmptyQueueException {
		if(this.isEmpty()==true) {
			throw new EmptyQueueException();
		}
		return this.linkedQueue.remove();
	}

	@Override
	public T getFront() throws EmptyQueueException{
		if(this.isEmpty()==true) {
			throw new EmptyQueueException();
		}
		return this.linkedQueue.peek();
	}

	@Override
	public boolean isEmpty() {
		return this.linkedQueue.isEmpty();
	}

	@Override
	public void clear() {
		this.linkedQueue.clear();
	}

}


public class QueueMain {

	public static void main(String[] args) throws EmptyQueueException{
		QueueTestDriver test = new QueueTestDriver();
		test.simulate(14);
		test.displayResults();
		test.reset();
	}

}

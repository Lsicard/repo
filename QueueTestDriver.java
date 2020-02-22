
public class QueueTestDriver {
	   private QueueInterface<Individual> line;
	   private int numInQueue;
	   private int numOutOfQueue;

	   public QueueTestDriver()
	   {
	      line = new LinkedQueue<>();
	      reset();
	   }
	   public void simulate(int maxQueueCap) throws EmptyQueueException
	   {
	      for(int i = 0; i < maxQueueCap; i++) {
	            numInQueue++;
	            Individual nextArrival = new Individual(i);
	            line.enqueue(nextArrival);
	            if(i==0) {
	            	System.out.println("Individual enters the front of the queue.");
	            }
	            else {
	            	System.out.println("Individual  enters queue in position #" + nextArrival.getQueuePos());
	            }
	            
	         if (!line.isEmpty()){
	            Individual dequeuedInd = line.dequeue();
	            this.numOutOfQueue++;
	            System.out.println("Individual #" + dequeuedInd.getQueuePos() + "  has left the front of the queue.");
	         }
	      }
	   }

	   /** Displays summary results of the simulation. */ 
	   public void displayResults()
	   {
	      System.out.println("Total number of Individuals entered queue: " + this.numInQueue);
	      System.out.println("Total number of Individuals exited queue: " + this.numOutOfQueue);
	   } 

	   /** Initializes the simulation. */ 
	   public final void reset()
	   {
	      line.clear();
	      numInQueue = 0;
	      numOutOfQueue = 0;
	   }
	}


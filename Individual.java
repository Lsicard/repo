
public class Individual {
	private String name;
	private int queuePos;
	
	public Individual(String newName, int newQueuePos) {
		this.name = newName;
		this.queuePos = newQueuePos;
	}
	
	public Individual(int i) {
		this.queuePos = i;
	}

	public String getName() {
		return this.name;
	}

	public int getQueuePos() {
		return this.queuePos;
	}

}

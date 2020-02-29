
public class ArraySum {
	public int sumOfArray(Integer[] myArray, int arraySize) {
		int sum = myArray[arraySize];
		if(arraySize==0) {
			return sum;
		}
		return sum+sumOfArray(myArray, arraySize-1);
	}
}

import java.util.Arrays;

public class Sorts{

	public static boolean DEBUG = false;

  public static void dprint(String s){
    if(DEBUG){
      System.out.println(s);
    }
  }

	public static void main(String[]args){
    //do this so you do not forget to turn it off
    dprint("TURN THIS OFF BEFORE SUBMITTING YOUR CODE!!!!!!!!");

    //Add the other parts of your main

  }

  /**Bubble sort of an int array.
  *@postcondition The array will be modified such that the elements will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data) {
		boolean sorted = false;

		int pass = 0;
		while (!sorted) {
			dprint(Arrays.toString(data));

			boolean swapped = false;
			for (int i = 0; i < (data.length - 1) - pass; i++) {
				if (data[i] > data[i+1]) {
					swapped = true;
					int holder = data[i];
					data[i] = data[i+1];
					data[i+1] = holder;
				}
			}

			if (!swapped) {
				sorted = true;
			}
			pass++;
		}

	}

	public static void selectionSort(int[] data) {

		for (int run = 0; run < data.length; run++) {
			dprint(Arrays.toString(data));

			int start = data[run];
			int min = data[run];
			int minIndex = run;

			for (int index = run; index < data.length; index++) {
				if (min > data[index]) {
					min = data[index];
					run = index;
				}
			}

			data[run] = min;
			data[minIndex] = start;
		}

	}

	public static void insertionSort(int[] data) {
		for (int index = 1; index < data.length; index++) {
			int insertionPosition = index - 1;

			if (data[index] < data[insertionPosition]) {
				while (data[index] < data[insertionPosition]) {
					insertionPosition--;
				}

				int value = data[index];

				for (int position = index-1; position >= insertionPosition; position--) {
					data[index+1] = data[index];
				}

				data[insertionPosition] = value;
			}
		}
	}

}

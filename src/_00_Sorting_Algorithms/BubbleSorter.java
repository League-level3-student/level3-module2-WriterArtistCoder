package _00_Sorting_Algorithms;

public class BubbleSorter extends Sorter{
	public BubbleSorter() {
		type = "Bubble";
	}
	
	//1. Use the bubble sorting algorithm to sort the arrayay.
	//   You can use display.updateDisplay() to show the current
	//   progress on the graph.
	@Override
	void sort(int[] array, SortingVisualizer display) {
		boolean outOfOrder = true;
		
		while (outOfOrder) {
			boolean outOfOrderYet = false;
			for (int i = 0; i < array.length; i++) {
				if (i > 0) {
					if (array[i] < array[i-1]) {
						int first = array[i-1];
						array[i-1] = array[i];
						array[i] = first;
						outOfOrderYet = true;
						
					}
				}
			}
			
			display.updateDisplay();
			
			outOfOrder = outOfOrderYet;
		}
	}
	
}

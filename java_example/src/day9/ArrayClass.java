package day9;

public class ArrayClass {

	static int maxValue(int[] array) {
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			max = array[i] < max ? max : array[i];
		}
		return max;
	}

	static int maxIndex(int[] array) {
		int index = 0;

		for (int i = 0; i < array.length; i++) {
			index = array[index] < array[i] ? i : index;
		}
		return index;
	}

}

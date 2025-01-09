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

	static void changeArr(int[] array) {
		int index = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[index] < array[i]) {
				index = i;
			}
		}
		int temp = array[index];
		array[index] = array[0];
		array[0] = temp;
	}

	// 배열에서 가장 작은 값을 찾아서 리턴해주는 메소드
	static int minValue(int[] array) {
		int min = array[0];
		for (int value: array) {
			min = min < array[value] ? min : array[value];
		}
		return min;
	}

	// 배열에서 가장 큰 값과 작은 값의 위치를 바꿔주는 메소드
	static void minIndex(int[] array) {
		int index = 0;
		for(int i = 0;i<array.length;i++) {
			if(array[index] > array[i]) {
				index = i;
			}
		}
		int temp = array[index];
		array[index] = array[0];
		array[0] = temp;
	}
}

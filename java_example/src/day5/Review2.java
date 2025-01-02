package day5;

public class Review2 {
	public static void main(String[] args) {
		int arr[] = { 3, 5, 10, 2, 4 };
		int sum = 0;
		int max = arr[0];
		int maxIndex = 0;
		for (int i = 0; i < arr.length; i++) {
			
			sum += arr[i];
			max = max > arr[i] ? max : arr[i];
			maxIndex = arr[maxIndex] > arr[i] ? maxIndex : i;

			System.out.println(arr[i]);
		}
		
		System.out.println(max);
		System.out.println(maxIndex);
	}
}

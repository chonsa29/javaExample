package day4;

public class Array3 {
	public static void main(String[] args) {
		int arr[] = { 3, 5, 2, 7, 10 };

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
	}
}

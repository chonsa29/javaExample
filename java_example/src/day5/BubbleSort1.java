package day5;

public class BubbleSort1 {
	public static void main(String[] args) {
		int arr[] = {3,5,2,4,1};
		
		for(int i = 1;i<arr.length;i++) {
			for(int j = 0; j<arr.length-i;j++) {
				int temp = arr[j+1];
				arr[j+1] = arr[j];
				arr[j] = temp;
			}
		}
	}
}

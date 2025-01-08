package day9;

public class ArrayRef {
	public static void main(String[] args) {
		int arr[] = {1,3,5,4,2};
		
		int max = ArrayClass.maxValue(arr);
		System.out.println(max);
		
		System.out.println(ArrayClass.maxIndex(arr));
	}
}

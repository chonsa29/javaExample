package day6;

import java.util.Arrays;
import java.util.Vector;

public class Array2 {
	public static void main(String[] args) {
		int arr[] = {3, 5, -4, -10, 8, -5, 6, 2};
		
		
		int cnt = 0;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]>0) cnt++;
		}
		
		int arr2[] = new int[cnt];
		
		int cnt2 = 0;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]>0) {
				arr2[cnt2] = arr[i];
				cnt2++;
			}
		}
		
		System.out.println(Arrays.toString(arr2));
		
		Vector<Integer> v= new Vector<Integer>();
		
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] > 0) {
				v.add(arr[i]);
			}
		}
	
		System.out.println(v);
	}
}

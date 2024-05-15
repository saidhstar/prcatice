package sorting;

import java.util.Arrays;

public class InsertionSort implements Sort {
	public static int[] insertionSort(int[] arr)
	{
		for(int i=1;i<arr.length;i++)
		{
			int key=arr[i];
			int j=i-1;
			while( j>=0 && arr[j]>key)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		return arr;
	}

	@Override
	public void sort(int[] arr) {
		// TODO Auto-generated method stub
		insertionSort(arr);
	}
	public static void main(String[] args) {
		int a[]= {3,1,5,9,2,10,4};
		System.out.println(Arrays.toString(insertionSort(a)));
	}
}

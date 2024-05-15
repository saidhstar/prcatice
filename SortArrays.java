package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SortArrays {

	public static void main(String[] args) {
		//Sort sort=new MergeSort();
		Sort sort1=new Quicksort();
		Sort sort2=new BubbleSort();
		Sort sort3=new SelectionSort();
		Sort insertionSort=new InsertionSort();
		int[] a= {3,1,5,9,2,10,4};
		
//		//Scanner sc=new Scanner(System.in);
//		int l=sc.nextInt();
//		int arr[]=new int[l];
//		for(int i=0;i<l;i++)
//		{
//			arr[i]=sc.nextInt();
//		}
		sort3.sort(a);
//	for(int n:a)
//	{
//		System.out.print(n+" , ");
//	}
		Arrays.toString(a);
	}

}

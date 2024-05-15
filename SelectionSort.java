package sorting;

public class SelectionSort implements Sort {
 public static void slectionSort(int[] arr)
 {
	 for(int i=0;i<arr.length-1;i++)
	 {
		 int min=i;
			 for(int j=i+1;j<arr.length;j++)
			 {
				 if(arr[j]<arr[min])
				 {
					 min=j;
				 }
			 }
			 if(i!=min)
			 {
				 int temp=arr[i];
				 arr[i]=arr[min];
				 arr[min]=temp;
						 
			 }
	 }
 }

@Override
public void sort(int[] arr) {
	// TODO Auto-generated method stub
	slectionSort(arr);
}
}

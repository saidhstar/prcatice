package sorting;

public class Quicksort implements Sort {
	public void quickSort(int[] arr,int start, int end)
	{
		int i=start,j=end;
		int pivot=arr[(start+end)/2];
		while(i<=j) {
			while(arr[i]<pivot) i++;
			while(arr[j]>pivot) j--;
			if(i<=j)
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
			j--;
			}
		}
		if(i<end) quickSort(arr,i,end);
		if(j>start) quickSort(arr,start,j);
	}

	@Override
	public void sort(int[] arr) {
		// TODO Auto-generated method stub
		quickSort(arr,0,arr.length-1);
	}
	

}

package sorting;

public class BubbleSort implements Sort {
	public static void bubbleSort(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
						
		}
	}
public static void main(String[] args) {
	int a[]={5,1,4,8,2,10,17,9};
	bubbleSort(a);
	for (int i : a) {
		System.out.print(i+" ,");
	}
}
	@Override
	public void sort(int[] arr) {
		// TODO Auto-generated method stub
		bubbleSort(arr);
	}

}

package sorting;

public class MergeSort implements Sort {
	public static void mergeSort(int[] arr)
	{
		int length=arr.length;
		if(length==1) return;
		int[] l=new int[length/2];
		int r[]=new int[length-l.length];
		int i=0;
		while(i<l.length)
		{
			l[i]=arr[i];
			i++;
		}
		int j=0;
		while(i<length)
		{
			r[j]=arr[i];
			j++;
			i++;
		}
		mergeSort(l);
		mergeSort(r);
		merge(arr,l,r);
	}
	public static void merge(int[] a,int[] b,int c[])
	{
		int i=0,j=0,k=0;
		while(i<c.length && j<b.length)
		{if(b[i]<c[j])
			a[k++]=b[i++];
		else a[k++]=c[j++];
		}
			while(i<b.length) a[k++]=b[i++];
			while(j<c.length) a[k++]=c[j++];
	}
	@Override
	public void sort(int[] arr) {
		// TODO Auto-generated method stub
		mergeSort(arr);
	}

}

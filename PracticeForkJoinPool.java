package sorting;

import java.util.concurrent.ForkJoinPool;

public class PracticeForkJoinPool {
	public static void main(String[] args) {
		int [] arr=new int[] {4,5,6,3,2,3,4,5,6,7,8,9,7,9,7,6,3,2};
		ForkJoinPool forkJoinPool=new ForkJoinPool();
		SumoffArrayUsingForktask sumoffArrayUsingForktask=new SumoffArrayUsingForktask(arr,0,arr.length);
		int result=forkJoinPool.invoke(sumoffArrayUsingForktask);
		System.out.println("sum of array  "+result);
		
	}

}

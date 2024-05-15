package sorting;

import java.util.concurrent.RecursiveTask;

public class SumoffArrayUsingForktask extends RecursiveTask<Integer>
{

	private final int thresold=5;
	private int[] array;
	private int start;
	private int end;
	public SumoffArrayUsingForktask(int[]a,int start,int end)
	{
		array=a;
		this.start=start;
		this.end=end;
	}
	@Override
	protected Integer compute() {
		int sum = 0;
		if((end-start)<=thresold)
		for(int a=start; a<end;a++)
		{
			sum+=array[a];
		}
		else {
			SumoffArrayUsingForktask leftSumoffArrayUsingForktask=new SumoffArrayUsingForktask(array,start,(start+end)/2);
			SumoffArrayUsingForktask rightSumoffArrayUsingForktask=new SumoffArrayUsingForktask(array,(start+end)/2,end);
			leftSumoffArrayUsingForktask.fork();
			rightSumoffArrayUsingForktask.fork();
			sum=leftSumoffArrayUsingForktask.join()+rightSumoffArrayUsingForktask.join();
		
		}
		return sum;
	}

}

package sorting;

import java.util.Arrays;

public class SingleNuminArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   int nums[]= {1,3,1,-1,3};
		  System.out.println( singleNumber(nums));
	}
public static int singleNumber(int[] nums) {
    String s=Arrays.toString(nums).replace("(", "").replace(",", "").replace("(", "");
    for(int n:nums)
    {
        int l=s.length();          
       s= s.replace(n+"","");
       if(n<0 &&  l-s.length()==2 )
       return n;
        if( l-s.length()==1)
            return n;
    }
    return 0;
}
}

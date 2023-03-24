package Questions;
import java.util.*;
import java.util.Arrays;
public class RotationSumMax 
{
	public static int maxSumRotateArray(int[] arr)
	{
		int n=arr.length;
		int tS=0;
		int mS=0;
		int cS=0;
		
	    for(int i=0;i<n;i++)
	     {
		   tS+=arr[i];
	     }
	    
	    for(int i=0;i<n;i++)
	     {
	    	cS+=arr[i];
	    	if(cS>mS)
	    	{
	    		mS=cS;
	    	}
	    	if(cS<0)
	    	{
	    		cS=0;
	    	}
	     }
	    for(int i=0;i<n;i++)
	     {
	    	tS -= arr[i];
	    	cS+=arr[i];
	    	if(cS>mS)
	    	{
	    		mS=cS;
	    	}
	    	if(cS<0)
	    	{
	    		cS=0;
	    	}
	     }
	    return Math.max(mS, tS + maxSumRotateArray(arr));
}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        int [] arr= {2,10,13,1,14,16,43,11};
        
	}

}

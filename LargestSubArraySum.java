package Problems;
public class LargestSubArraySum 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        int maxSum = kadane(arr);
        System.out.println("Largest sum of a contiguous subarray: " + maxSum);
    }
    
    public static int kadane(int[] arr) {
        int maxSoFar = arr[0];
        int maxEndingHere = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            maxEndingHere = Math.max(maxEndingHere + arr[i], arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        
        return maxSoFar;
	}

}

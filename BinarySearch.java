package Problems;
//USing the sorting mechanism
public class BinarySearch 
{
	 public static int binarySearch(int[] arr, int target) 
	 {
	        int left=0;
	        int right=arr.length - 1;
	        
	        while (left<=right) 
	        {
	            int mid=(left+right)/2;
	            
	            if (arr[mid]==target) 
	            {
	                return mid;
	            } 
	            else if (arr[mid]<target) 
	            {
	                left=mid+1;
	            } 
	            else 
	            {
	                right=mid-1;
	            }
	        }
	        return -1;
	    }
	    
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] arr = {5, 20, 6, 9, 55, 110, 25, 65, 68};
        int target = 68;
        
        int index = binarySearch(arr, target);
        
        if (index == -1) 
        {
            System.out.println("Target value not found in array");
        } 
        else 
        {
            System.out.println("Target value found at index " + index);
        }

	}

}

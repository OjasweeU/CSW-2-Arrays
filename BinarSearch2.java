package Problems;
//Without Searching babes
public class BinarSearch2 
{
	public static int linearSearch(int[] arr, int target)
	{
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] == target) 
            {
                return i;
            }
        }
        
        return -1;
    }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] arr = {5, 20, 6, 9, 55, 110, 25, 65, 68};
        int target = 68;
        
        int index = linearSearch(arr, target);
        
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

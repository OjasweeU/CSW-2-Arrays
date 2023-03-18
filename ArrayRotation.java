package Problems;
public class ArrayRotation 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int pos = 2;
        
        // Print original array
        System.out.println("Original Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        // Rotate array by pos positions
        int[] temp = new int[pos];
        for (int i = 0; i < pos; i++) {
            temp[i] = arr[i];
        }
        for (int i = pos; i < arr.length; i++) {
            arr[i-pos] = arr[i];
        }
        for (int i = 0; i < pos; i++) {
            arr[arr.length-pos+i] = temp[i];
        }
        
        // Print rotated array
        System.out.println("Rotated Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
	}

}

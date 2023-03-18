package Problems;
public class FindParticularValue 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] arr = {2, 4, 6, 8, 10};
		int target = 8;
		boolean found = false;

		for (int i = 0; i < arr.length; i++) {
		    if (arr[i] == target) {
		        found = true;
		        break;
		    }
		}

		if (found) {
		    System.out.println("The target value " + target + " was found in the array.");
		} else {
		    System.out.println("The target value " + target + " was not found in the array.");
		}

	}

}

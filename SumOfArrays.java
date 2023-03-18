package Problems;
import java.util.Arrays;
import java.util.*;
public class SumOfArrays 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int myArr[]=new int[size];
        int sum=0;
        System.out.println("Enter the elements of Array:");
        for(int i=0;i<size;i++)
        {
        	myArr[i]=sc.nextInt();
        	sum=sum+myArr[i];
        }
        System.out.println("Elements of the Array are: "+ Arrays.toString(myArr));
        System.out.println("Sum of the Elements of Array is::"+ sum);
        sc.close();
	}

}

package Questions;
import java.util.*;
public class FibbonacciSeries 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n, t1 = 0, t2 = 1, nextTerm = 0, i;
		System.out.println("Enter the n value: ");
		n = sc.nextInt();
		if(n == 0) 
		System.out.println(n);
		else
		nextTerm = t1 + t2;
		for (i = 3; i <= n; ++i)
		{
		t1 = t2;
		t2 = nextTerm;
		nextTerm = t1 + t2;
		}
		System.out.println(t2);
	}

}

package Questions;
import java.util.*;
public class TowerOfHanoi 
{
	public static void toH(int n, char fr, char tr, char ar)
	{
		if (n == 0) {
            return;
        }
        toH(n - 1, fr, ar, tr);
        System.out.println("Move disk " + n + " from rod " + fr + " to rod "+ tr);
        toH(n - 1, ar, tr, fr);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int n = 4; 
        // A, B and C are names of rods
        toH(n, 'A', 'C', 'B');
	}

}

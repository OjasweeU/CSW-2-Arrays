package Questions;

public class GreatestCommonDivisor 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a = 112, b = 543;   
		System.out.println("GCD of " + a +" and " + b + " is " + findGCD(a, b));   
	}  
		//recursive function to return GCD of a and b   
	static int findGCD(int a, int b)   
	{   
		if (b == 0)   
		return a;     
		return findGCD(b, a % b);  
    }

}


//Using the Euclidean Algorithm
/*import java.util.Scanner;  
public class FindGCDExample5  
{  
public static void main(String args[])  
{  
Scanner sc = new Scanner(System.in);  
System.out.println("Enter the two numbers: ");  
int x = sc.nextInt();  
int y = sc.nextInt();  
System.out.println("The GCD of two numbers is: " + findGCD(x,y));  
}  
static int findGCD(int x, int y)  
{  
int r=0, a, b;  
a = (x > y) ? x : y; // a is greater number  
b = (x < y) ? x : y; // b is smaller number  
r = b;  
while(a % b != 0)  
{  
r = a % b;  
a = b;  
b = r;  
}  
return r;  
}  
}  */

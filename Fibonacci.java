import java.util.*;

class Number
{
	public void Display(int iNo)
	{
		int i=0, first=0, second=1, next=0;
		
		for(i=0;i<iNo;i++)
		{
			System.out.print(first+"\t");
			next=first+second;
			first=second;
			second=next;	
		}
		System.out.println();		
	}
}

class Fibonacci
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter number");
		int value=sobj.nextInt();
		
		Number nobj=new Number();
		nobj.Display(value);
	}
}
	

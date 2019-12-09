import java.util.*;

class Number
{
	public void DisplayLucus(int iNo)
	{
		int iFirst=2, iSecond=1, iNext=0, i=0;
		
		if(iNo<0)
		{
			iNo=-iNo;
		}
		
		System.out.print("2, 1, ");
		
		for(i=2;i<iNo;i++)
		{
			iNext=iFirst+iSecond;
			iFirst=iSecond;
			iSecond=iNext;
			System.out.print(iNext+", ");
		}
		System.out.println();
	}
}

class DisplayLucusNumber
{
	public static void main(String argv[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter number:");
		int value=sobj.nextInt();
		
		System.out.println("First "+value+" Lucus numbers are : ");
		
		Number nobj=new Number();
		
		nobj.DisplayLucus(value);
	}
}

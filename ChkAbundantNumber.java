import java.util.*;

class Number
{
	public boolean ChkAbundant(int iNo)
	{
		int iSum=0, i=0;
		
		if(iNo<=0)
		{
			return false;
		}
		
		for(i=1;i<=iNo/2;i++)
		{
			if(iNo%i==0)
			{
				iSum=iSum+i;
			}
		}
				
		if(iSum<iNo)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
}

class ChkAbundantNumber
{
	public static void main(String argv[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter number:");
		int value=sobj.nextInt();
		
		System.out.println("Entered number is "+value);
		
		boolean bRet=false;
		
		Number nobj=new Number();
		
		bRet=nobj.ChkAbundant(value);
		
		if(bRet==true)
		{
			System.out.println(value + " is Abundant number");
		}
		else
		{
			System.out.println(value + " is not Abundant number");
		}
	}
}

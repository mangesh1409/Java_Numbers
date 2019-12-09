import java.util.*;

class Number
{
	public boolean ChkAmicable(int iNo1, int iNo2)
	{
		int iSum=0, i=0;
		
		if((iNo1<0)||(iNo2<0))
		{
			return false;
		}
		
		for(i=1;i<=iNo2/2;i++)
		{
			if(iNo2%i==0)
			{
				iSum=iSum+i;
			}
		}
		
		if(iNo1==iSum)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

class ChkAmicablePair
{
	public static void main(String argv[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter 1st number:");
		int value1=sobj.nextInt();
		
		System.out.println("Enter 2nd number:");
		int value2=sobj.nextInt();
		
		System.out.println("Entered number are "+value1+","+value2);
		
		boolean bRet=false;
		
		Number nobj=new Number();
		
		bRet=nobj.ChkAmicable(value1,value2);
		
		if(bRet==true)
		{
			System.out.println(value1+","+value2+" is amicable pair");
		}
		else
		{
			System.out.println(value1+","+value2+" is not amicable pair");
		}
	}
}

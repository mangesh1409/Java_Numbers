import java.util.*;

class Number
{
	public boolean ChkLucky(int iNo)
	{
		int idigit=0, iCnt=0, idigit1=0, temp=0;
		
		if(iNo<0)
		{
			iNo=-iNo;
		}
		
		while(iNo!=0)
		{
			idigit=iNo%10;
			
			temp=iNo/10;
			iCnt=0;
			
			while(temp!=0)
			{
				idigit1=temp%10;
				
				if(idigit1==idigit)
				{
					iCnt++;
					break;
				}
				
				temp=temp/10;
			}
			
			if(iCnt!=0)
			{
				break;
			}
			
			iNo=iNo/10;
		}
		
		if(iCnt!=0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
}

class ChkLuckyNumber
{
	public static void main(String argv[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter number:");
		int value=sobj.nextInt();
		
		System.out.println("Entered number is "+value);
		
		boolean bRet=false;
		
		Number nobj=new Number();
		
		bRet=nobj.ChkLucky(value);
		
		if(bRet==true)
		{
			System.out.println(value + " is Lucky number");
		}
		else
		{
			System.out.println(value + " is not Lucky number");
		}
	}
}

import java.util.*;

class Number
{
	public boolean ChkStrong(int iNo)
	{
		int idigit=0, iFact=0, iSum=0, temp=0;
		
		if(iNo<0)
		{
			iNo=-iNo;
		}
		
		temp=iNo;
		
		if(iNo==0)
		{
			return false;
		}
		
		while(iNo!=0)
		{
			idigit=iNo%10;
			
			iFact=1;
			
			for(int i=idigit;i>0;i--)
			{
				iFact=iFact*i;
			}
			
			iSum=iSum+iFact;
			
			if(iSum>temp)
			{
				break;
			}
				
			iNo=iNo/10;
		}
		
		if(temp==iSum)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

class ChkStrongNumber
{
	public static void main(String argv[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter number:");
		int value=sobj.nextInt();
		
		System.out.println("Entered number is "+value);
		
		boolean bRet=false;
		
		Number nobj=new Number();
		
		bRet=nobj.ChkStrong(value);
		
		if(bRet==true)
		{
			System.out.println(value + " is Strong number");
		}
		else
		{
			System.out.println(value + " is not Strong number");
		}
	}
}

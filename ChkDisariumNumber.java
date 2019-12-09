import java.util.*;

class Number
{
	public boolean ChkDisarium(int iNo)
	{
		int iDigit=0, iPower=0, iSum=0, temp=0, iCnt=0;
		
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
			iCnt++;				
			iNo=iNo/10;
		}
		
		iNo=temp;
		
		while(iNo!=0)
		{
			iDigit=iNo%10;
			
			iPower=1;
			
			for(int i=0;i<iCnt;i++)
			{
				iPower=iPower*iDigit;
			}
			
			iCnt--;
			
			iSum=iSum+iPower;
			
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

class ChkDisariumNumber
{
	public static void main(String argv[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter number:");
		int value=sobj.nextInt();
		
		System.out.println("Entered number is "+value);
		
		boolean bRet=false;
		
		Number nobj=new Number();
		
		bRet=nobj.ChkDisarium(value);
		
		if(bRet==true)
		{
			System.out.println(value + " is Disarium number");
		}
		else
		{
			System.out.println(value + " is not Disarium number");
		}
	}
}

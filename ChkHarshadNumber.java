import java.util.*;

class Number
{
	public boolean ChkHarshad(int iNo)
	{
		int iDigit=0, iSum=0, temp=0;
		
		if(iNo<=0)
		{
			return false;
		}
		
		temp=iNo;
		
		while(iNo!=0)
		{
			iDigit=iNo%10;
			
			iSum=iSum+iDigit;
			
			iNo=iNo/10;
		}
		
		if(temp%iSum==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

class ChkHarshadNumber
{
	public static void main(String argv[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter number:");
		int value=sobj.nextInt();
		
		System.out.println("Entered number is "+value);
		
		boolean bRet=false;
		
		Number nobj=new Number();
		
		bRet=nobj.ChkHarshad(value);
		
		if(bRet==true)
		{
			System.out.println(value + " is Harshad number");
		}
		else
		{
			System.out.println(value + " is not Harshad number");
		}
	}
}

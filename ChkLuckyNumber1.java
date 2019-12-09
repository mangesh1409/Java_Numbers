import java.util.*;

class Number
{
	public boolean ChkLucky(int iNo)
	{
		int idigit=0;
		int arr[]={0,0,0,0,0,0,0,0,0,0};
		
		if(iNo<0)
		{
			iNo=-iNo;
		}
		
		while(iNo!=0)
		{
			idigit=iNo%10;
			
			arr[idigit]++;
			if(arr[idigit]>1)
			{
				break;
			}			
			iNo=iNo/10;
		}
		
		if(iNo==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

class ChkLuckyNumber1
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

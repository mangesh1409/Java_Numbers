import java.util.*;

class Number
{
	public boolean ChkDuck(int iNo)
	{
		int iDigit=0;
		
		if(iNo<0)
		{
			iNo=-iNo;
		}
		
		while(iNo!=0)
		{
			iDigit=iNo%10;
						
			if(iDigit==0)
			{
				break;
			}
			
			iNo=iNo/10;
		}
		
		if(iNo!=0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

class ChkDuckNumber
{
	public static void main(String argv[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter number:");
		int value=sobj.nextInt();
		
		System.out.println("Entered number is "+value);
		
		boolean bRet=false;
		
		Number nobj=new Number();
		
		bRet=nobj.ChkDuck(value);
		
		if(bRet==true)
		{
			System.out.println(value + " is Duck number");
		}
		else
		{
			System.out.println(value + " is not Duck number");
		}
	}
}

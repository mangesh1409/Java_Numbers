import java.util.*;

class Number
{
	public boolean ChkPronic(int iNo)
	{
		int i=0;
		
		if(iNo<0)
		{
			return false;
		}
		
		for(i=0;i<=iNo/2;i++)
		{
			if(i*(i+1)==iNo)
			{
				break;
			}
		}	
		
		if(i<=iNo/2)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

class ChkPronicNumber
{
	public static void main(String argv[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter number:");
		int value=sobj.nextInt();
		
		System.out.println("Entered number is "+value);
		
		boolean bRet=false;
		
		Number nobj=new Number();
		
		bRet=nobj.ChkPronic(value);
		
		if(bRet==true)
		{
			System.out.println(value + " is Pronic number");
		}
		else
		{
			System.out.println(value + " is not Pronic number");
		}
	}
}

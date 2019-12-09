import java.util.*;

class Number
{
	public boolean ChkAutomorphic(int iNo)
	{
		int iSqure=0, iDigit1=0, iDigit2=0;
		
		if(iNo<0)
		{
			iNo=-iNo;
		}
		
		iSqure=iNo*iNo;
		
		while((iNo!=0)&&(iSqure!=0))
		{
			iDigit1=iNo%10;
			iDigit2=iSqure%10;
			
			if(iDigit1!=iDigit2)
			{
				break;
			}
			
			iNo=iNo/10;
			iSqure=iSqure/10;
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

class ChkAutomorphicNumber
{
	public static void main(String argv[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter number:");
		int value=sobj.nextInt();
		
		System.out.println("Entered number is "+value);
		
		boolean bRet=false;
		
		Number nobj=new Number();
		
		bRet=nobj.ChkAutomorphic(value);
		
		if(bRet==true)
		{
			System.out.println(value + " is Automorphic number");
		}
		else
		{
			System.out.println(value + " is not Automorphic number");
		}
	}
}

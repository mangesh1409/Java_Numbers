import java.util.*;

class Number
{
	public boolean ChkAnagram(int iNo1, int iNo2)
	{
		int arr[]={0,0,0,0,0,0,0,0,0,0};
		int brr[]={0,0,0,0,0,0,0,0,0,0};

		int iDigit=0, i=0;
		
		if(iNo1<0)
		{
			iNo1=-iNo1;
		}
		if(iNo2<0)
		{
			iNo2=-iNo2;
		}
		
		while(iNo1!=0)
		{
			iDigit=iNo1%10;
			arr[iDigit]++;
			iNo1=iNo1/10;
		}
		
		while(iNo2!=0)
		{
			iDigit=iNo2%10;
			brr[iDigit]++;
			iNo2=iNo2/10;
		}
		
		for(i=0;i<10;i++)
		{
			if(arr[i]!=brr[i])
			{
				break;
			}
		}
		
		if(i==10)
		{
			return true;
		}
		else
		{
			return false;
		}
	}	
}

class ChkAnagram
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter 1st number");
		int value1=sobj.nextInt();

		System.out.println("Enter 2nd number");
		int value2=sobj.nextInt();
		
		Number nobj=new Number();
		boolean bRet=false;
		
		bRet=nobj.ChkAnagram(value1,value2);
		
		if(bRet==true)
		{
			System.out.println(value1+","+value2+" are Anagram numbers");
		}
		else
		{
			System.out.println(value1+","+value2+" are not Anagram numbers");
		}
	}
}

package Pattren;

public class p25 
{

	public static void main(String[] args) 
	{
		int end=1;
		for(int i=1;i<=5;i++)
		{
			char ch='A';
			
			for(int j=1;j<=end;j++,ch++)
			{
				System.out.print(ch);
				//ch++;
			}
			System.out.println();
			end++;
		}

	}

}

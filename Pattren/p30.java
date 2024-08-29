package Pattren;

public class p30 
{

	public static void main(String[] args) 
	{
		int end=6;
		for(int i=1;i<=11;i++)
		{
			char ch='F';
			
			for(int j=1;j<=end;j++,ch--)
			{
				System.out.print(ch);
				//ch++;
			}
			System.out.println();
			
			if(i<6)
				end--;
			else
				end++;
			//if(i==7)System.out.print("A");
		}
	}

}

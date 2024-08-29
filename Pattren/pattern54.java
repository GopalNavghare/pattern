package Pattren;

public class pattern54 
{
	public static void main(String[] args) 
	{
	
		int space=0;
		int end=9;
		int cnt1=9;
		
		for(int i=1;i<=9;i++)
		{
			int cnt2=cnt1;
			for(int j=1;j<=end;j++)
			{
				if(j<=space)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print(cnt2+" ");
					
				}
			}
			System.out.println();
			cnt1--;
			
			space++;}
	}
}

package Pattren;

public class pattern71 {

	public static void main(String[] args) 
	{
		int end=5;
		int space=4;
		for(int i=1;i<=5;i++)
		{ 
			int cnt1=1;
			
			for(int j=1;j<=end;j++)
			{
				if(j<=space)
				{
					System.out.print(" ");	
				}
				else
				{
					System.out.print(cnt1);
					cnt1++;
				}
			}
			for(int j=i-1;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
			
			space--;
		}
		
	}

}

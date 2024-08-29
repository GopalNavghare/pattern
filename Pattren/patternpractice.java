package Pattren;

public class patternpractice 
{

	public static void main(String[] args) 
	{
		int FTEP=5;
		int STSP=6;
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=9;j++)
			{
				if(j>=FTEP||j<=STSP)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			FTEP--;
			STSP--;
		}
	}
}

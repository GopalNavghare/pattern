package Pattren;

public class Pattren1 
{

	public static void main(String[] args) 
	{int end=5;
		for(int i=1;i<=5;i++)  //i=2;
		{
			for(int j=1;j<=5;j++)//j=10
			{
				if(i==5||i+j==6)
				    System.out.print("*");
				else
					System.out.print(" ");
			}
			for(int j=2;j<=5;j++)
			{
				if(i==5||i==j)
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}

	}

}

package Pattren;

public class p86
{

	public static void main(String[] args) 
	{
		int end=5;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=end;j++)
			{
				if(i==j)
					System.out.print("O");
				else
					System.out.print("X");
			}
			System.out.println();
		}

	}

}

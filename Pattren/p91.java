package Pattren;

public class p91 {

	public static void main(String[] args) 
	{
		int end=5;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=end;j++)
			{
				if(i==j)
					System.out.print("N");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}

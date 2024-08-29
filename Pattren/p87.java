package Pattren;

public class p87 {

	public static void main(String[] args) 
	{
		int end=5;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=end;j++)
			{
				if(i==j||i+j==6)
					System.out.print("A");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}

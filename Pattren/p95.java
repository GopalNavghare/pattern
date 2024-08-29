package Pattren;

public class p95 {

	public static void main(String[] args) 
	{
		int end=5;
		for(int i=1;i<=end;i++)
		{
			for(int j=1;j<=end;j++)
			{
				if(i==1||j==5||i==j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}


	}

}

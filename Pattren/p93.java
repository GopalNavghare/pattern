package Pattren;

public class p93 {

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
			for(int j=2;j<=end;j++)
			{
				if(i+j==6)
					System.out.print("N");
				else
					System.out.print(" ");
			}
			System.out.println();
		
			
		}
			



	}

}

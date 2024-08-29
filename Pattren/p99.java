package Pattren;

public class p99 {

	public static void main(String[] args) {
		int end=5;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=end;j++)
			{
				if(j==1||i==j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.println();
		}
		for(int i=2;i<=5;i++)
		{
			for(int j=1;j<=end;j++)
			{
				if(j==1||i+j==6)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.println();
		}
	

	}

}

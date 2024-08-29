package Pattren;

public class p96 {

	public static void main(String[] args) {

		int end=5;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=end;j++)
			{
				if(i+j==6||i==5)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			for(int j=2;j<=end;j++)
			{
				if(i==j||i==5)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}


	}

}

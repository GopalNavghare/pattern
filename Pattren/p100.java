package Pattren;

public class p100 {

	public static void main(String[] args) {
		int end=5;
		for(int i=1;i<=end;i++)
		{
			for(int j=1;j<=end;j++)
			{
				if(i+j==6||j==5)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
			
		}
		for(int i=2;i<=end;i++)
		{
			for(int j=1;j<=end;j++)
			{
				if(i==j||j==5)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.println();
		}

	}

}

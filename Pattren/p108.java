package Pattren;

public class p108 {

	public static void main(String[] args) 
	{
		int end=5;
		for(int i=1;i<=5;i++)
		{
			for(int j=2;j<=end;j++)
			{
				System.out.print("1");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
			end--;
		}

	}

}

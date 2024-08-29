package Pattren;

public class p89 {

	public static void main(String[] args) 
	{
		int end=5;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=end;j++)
			{
				if(i==5||i==1||j==1||j==5)
					System.out.print("P");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}

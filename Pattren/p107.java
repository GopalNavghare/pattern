package Pattren;

public class p107 {

	public static void main(String[] args) 
	{
		int end=5;
		int space=0;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=end;j++)
			{
				if((i==j))
				{
					System.out.print("1");
				}
				else
					System.out.print("0");
			}
			System.out.println();
			
		}
	
	}

}

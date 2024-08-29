package Pattren;

public class patternbutterfly {

	public static void main(String[] args) 
	{
		
		int irange=9;
		int jrange=9;
		for(int i=1;i<=irange;i++)
		{
			for(int j=1;j<=jrange;j++)
			{
				if(j==1||i==j||i+j==10||j==9) 
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		    		
		}
	}

}

package Pattren;

public class p128 
{
	public static void main(String[] args) 
	{
		int end=7;
		for(int  i=1;i<=end;i++)
	    {
		   for(int j=1;j<=end;j++)
		   {
			if(j==1&&i!=1&&i!=7||j==7&&i!=1&&i!=7||i==1&&j!=1&&j!=7||i==7&&j!=1&&j!=7)
				System.out.print("*");
			else
				System.out.print(" ");
		  }	
		   	System.out.println();
	   }
	}

}

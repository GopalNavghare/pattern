package Pattren;

public class Heart 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		for(int  i=1;i<=7;i++)
		{
			for(int j=1;j<=9;j++)
			{
				if(i==1||i==7||j==5)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
			
		}
		System.out.println();
		System.out.println();
		for(int i=0;i<=5;i++)
		{
	        for(int j=0;j<=6;j++)
	        {
	          if((i==0&&j%3!=0) || (i==1&&j%3==0) || i-j==2 || i+j==8)
	          {
	            System.out.print("* ");
	          }
	          else
	          {
	            System.out.print("  ");
	          }
	        }
	        System.out.println();
	      }
		System.out.println();
		System.out.println();
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=9;j++)
			{
				if(j==1&&i!=7||j==9&&i!=7||i==7&&j!=1&&j!=9)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}

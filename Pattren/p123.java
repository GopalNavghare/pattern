package Pattren;

public class p123 {

	public static void main(String[] args) {
		for(int  i=1;i<=7;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==1||i==7&&j!=5&&j!=4||j==3||i==6&&j!=5&&j!=4&&j!=2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}

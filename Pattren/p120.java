package Pattren;

public class p120 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int  i=1;i<=7;i++)
		{
			for(int j=1;j<=6;j++)
			{
				if(j==1||i==1&&j!=6||i==4&&j!=2&&j!=3||i==7&&j!=6||j==5&&i!=2&&i!=3)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}

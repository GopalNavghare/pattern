package Pattren;

public class p116 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int  i=1;i<=6;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j==1&&i!=1&&i!=6||i==1&&j!=1||i==6&&j!=1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}

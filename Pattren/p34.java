package Pattren;

public class p34 {

	public static void main(String[] args) 
	{
		int end=6;
		for(int i=1;i<=6;i++)
		{
			char ch='A';
			 for(int j=1;j<=end;j++)
			{
				System.out.print(ch+" ");
				ch++;
			}
			 System.out.println();
			 end--;
		}

	}

}

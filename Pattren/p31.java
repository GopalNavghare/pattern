package Pattren;

public class p31 {

	public static void main(String[] args) 
	{
		int end=6;
		int space=5;
		for(int i=1;i<=6;i++)
		{
			char ch='A';
			for(int j=1;j<=end;j++)
			{
				if(j<=space)
					System.out.print(" ");
				else
				{
					System.out.print(ch+" ");
					ch++;
				}
			}
			System.out.println();
			space--;
			
		}

	}

}

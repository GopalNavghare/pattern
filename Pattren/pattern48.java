package Pattren;

public class pattern48 {

	public static void main(String[] args) 
	{
		int cnt1=9;
		int end=1;
		
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=end;j++)
			{
				System.out.print(cnt1);
			}
			System.out.println();
			cnt1--;
			end++;
		}

	}

}

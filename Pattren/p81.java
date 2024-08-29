package Pattren;

public class p81 {

	public static void main(String[] args) 
	{
		int FirstTringleStartpoint=1;
		int SecondTringleEndpoint=9;
		
		for(int i=1;i<=5;i++)
		{
			
			int cnt1=1;
			int cnt2=cnt1;
			for(int j=1;j<=5;j++)
			{
				if(j<=FirstTringleStartpoint )
					{
					System.out.print(cnt1);
					cnt1++;
					}
				else
					System.out.print(" ");
			}
			for(int j=5;j<=9;j++)
			{
				if(j>=SecondTringleEndpoint )
					{
					System.out.print(cnt2);
					cnt2++;
					}
				else
					System.out.print(" ");
			}
			cnt1++;
			System.out.println();
			FirstTringleStartpoint++;
			SecondTringleEndpoint--;
		}

	}

}

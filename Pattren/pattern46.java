package Pattren;

public class pattern46 {

	public static void main(String[] args) 
	{
		int cnt1=9;
		int end=1;
		for(int i=1;i<=9;i++)
		{
			int cnt2=cnt1;
			for(int j=1;j<=end;j++) 
			{
				System.out.print(cnt2);
				cnt2--;
			}
			System.out.println();
			cnt2--;
			end++;
		}

	}

}

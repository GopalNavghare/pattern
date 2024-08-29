package Pattren;

public class p110 {

	public static void main(String[] args) 
	{
		int end=5;
		int space=0;
		
		for(int i=1;i<=5;i++)
		{
		
			int cnt2=4;
			for(int j=1;j<=end;j++)
			{
				if(j<=space)
				{
					System.out.print(cnt2);
				   cnt2--;
				}	
			}
			System.out.println();
			space++;
			//cnt1++;
			
			
		}

	}

}

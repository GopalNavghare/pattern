package Pattren;

public class P51 {

	public static void main(String[] args) {
		int space=4;
		int end=5;
		int cnt1=1;
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=end;j++)
			{
				if(j<=space) 
					System.out.print(" ");
				else
					System.out.print(cnt1+" ");
			}
			System.out.println();
			if(i<5)
			{
				cnt1++;
				space--;
			}
			else
			{
				space++;
				cnt1--;
			}
		}

	}

}

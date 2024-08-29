package Pattren;

public class p27 
{
  public static void main(String[] args) {
	  int end=1;
		char ch='A';
		for(int i=1;i<=9;i++)
		{
			char ch1=ch;
			
			for(int j=1;j<=end;j++)
			{
				System.out.print(ch1);
			}
			System.out.println();
			if(i<5)
			{
				ch++;
				end++;
			}
			else
			{
				ch--;
				end--;
			}
			
		}
}
}

package Pattren;

public class p33 {

	public static void main(String[] args) {
	
		int end=1;
		for(int i=1;i<=6;i++)
		{
			char ch='F';
			
			for(int j=1;j<=end;j++,ch--)
			{
				System.out.print(ch);
				//ch--;
			}
			System.out.println();
			end++;
		}

	}

}

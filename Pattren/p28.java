package Pattren;

public class p28 {

	public static void main(String[] args) {
		int end=1;
		for(int i=1;i<=9;i++)
		{
			char ch='A';
			
			for(int j=1;j<=end;j++,ch++)
			{
				System.out.print(ch);
				//ch++;
			}
			System.out.println();
			
			if(i<5)
				end++;
			else
				end--;
		}

	}

}

package Pattren;

public class p29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int end=6;
		for(int i=1;i<=11;i++)
		{
			char ch='A';
			
			for(int j=1;j<=end;j++,ch++)
			{
				System.out.print(ch);
				//ch++;
			}
			System.out.println();
			
			if(i<6)
				end--;
			else
				end++;
			//if(i==7)System.out.print("A");
		}
	}

}

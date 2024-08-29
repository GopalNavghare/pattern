package Pattren;

public class p77 {

	public static void main(String[] args) {
		int end=5;
		for(int i=1;i<=end;i++)
		{
			System.out.print(i);
			for(int j=1,p=i,num=4;j<i;j++,num--)
			{
				p=p+num;
				System.out.print(" "+p);
             
			}
			
			System.out.println();
			
			
			
		}
	}
}

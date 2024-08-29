package Pattren;

public class p36 {

	public static void main(String[] args) {
	
		 char ch='A';
		 int end=1;
		 for(int i=1;i<=6;i++)
		 {
			 char ch1=ch;
			 for(int j=1;j<=end;j++)
			 {
				 System.out.print(ch1);
				 ch1--;
			 }
			 System.out.println();
			 ch++;
			 end++;
		 }

	}

}

package Pattren;
public class p37 
{
	public static void main(String[] args)
	{
		   char ch1='A';
		   int end=1;
		   for(int i=1;i<=6;i++) 
		   {
			   char ch=ch1;
			   for(int j=1;j<=end;j++)
			   {
				   System.out.print(ch);
				   ch=(char)(ch+5);
			   }
			   System.out.println();
			   end++;
			   ch1++;
		 }
	}

}

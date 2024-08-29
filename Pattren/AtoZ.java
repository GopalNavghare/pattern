package Pattren;

public class AtoZ 
{

	public static void main(String[] args) 
	{
		//inter.9
		King k = new King();
		System.out.print("Output = " + k.new Elephant().step2(6, 9));
	}
}
class King 
{
	interface Queen 
	{
		float step2(int low, int high);
	}
	interface Pawn 
	{
		float step3(int a, int b, int c);
	}
	abstract class Knight implements Queen, Pawn 
	{
	}
	class Elephant implements Queen 
	{
		public float step2(int x, int y) 
		{
			return (float)(x * 3);
		}
	}
	//System.out.println();
		

}

//Special Pythagorean triplet

public class prj9 
{
	public static void main(String[] args) 
	{
		int abc = 1000;
		
		for(int a = 1; a< abc; a++)
		{
			for(int b = a+1; b < abc; b++)
			{
				int c = abc - a - b;
				
				if(a*a + b*b == c*c)
					System.out.println(a*b*c);
			}
		}
	}
}

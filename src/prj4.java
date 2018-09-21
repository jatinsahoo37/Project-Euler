//Largest palindrome product

public class prj4 
{
	public static void main(String[] args) 
	{
		int maxPalin = 0;
		
		for(int i = 100; i<1000; i++)
		{
			for(int j = 100; j<= 1000; j++)
			{
				int p = i*j;
				
				if(isPalindrome(p) && p > maxPalin)
				{
					maxPalin = p;
					
				}
			}
		}
		
		System.out.println(maxPalin);
	}

	
	private static boolean isPalindrome(int p) 
	{
		int n = p;
		int rev = 0;
		
		while(n>0)
		{
			int rem = n%10;
			rev = rev*10 + rem;
			n = n/10;
		}
		
		if(p == rev)
		{
			return true;
		}
		return false;
		
	}
}

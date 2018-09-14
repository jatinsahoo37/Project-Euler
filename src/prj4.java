//Largest palindrome product

public class prj4 
{
	public static void main(String[] args) 
	{
		int maxPalindrome = 0;

		int i = 0;
		int j = 0;
		
		for(i = 999; i > 999; i--)
		{
			for(j = 999; j>=i; j--)
			{
				int p = i*j;
				
				int n = p;
				int rev = 0;
				
				while(n>0)
				{
					int rem = n%10;
					rev = rev*10 + rem;
					n = n/10;
				}
				
				if(rev == p)
				{
					maxPalindrome = p;
					
					System.out.println("the largest palindrome is: "+i+" x "+j+" = "+maxPalindrome);
					break;
				}
								
			}
			if(maxPalindrome != 0)
				break;
			
		}	
	}
}

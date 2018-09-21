//Largest prime factor

public class prj3 
{
	public static void main(String[] args) 
	{
		long n = 600851475143L;
		
		long a = n;
		long b = 0;
		while(true)
		{
			long p = smallestFactor(n);
			if(p<n)
				n /= p;
			else
				System.out.println(n);
		}
	}

	private static long smallestFactor(long n) 
	{
		if (n <= 1)
			throw new IllegalArgumentException();
			
		for(long i = 2, e = (long) Math.sqrt(n); i<=e;i++)
		{
			if(n%i==0)
			{
				n = i;
			}
		}
		return n;
	}
	
	
}

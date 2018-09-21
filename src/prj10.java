//Summation of primes

import java.util.ArrayList;

public class prj10 
{
	public static void main(String[] args) 
	{
		long sum = 2;
		
		for(long i = 3; i<2000000; i+=2)
		{
			if(isPrime(i))
				sum+=i;
		}
		
		System.out.println(sum);
		
		
	}

	private static boolean isPrime(long i) 
	{
		boolean res = true;
		
		for(long a = 2; a<i; a++)
		{
			if(i % a == 0)
			{
				res = false;
				break;
			}
		}
		
		return res;
	}
}

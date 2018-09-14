//Summation of primes

import java.util.ArrayList;

public class prj10 
{
	public static void main(String[] args) 
	{
		long sum = 0;
		
		int limit = 2000000;
		
		ArrayList<Integer> primes = getPrimesTo(limit - 1);
		
		for(int i = 0; i < primes.size(); i++)
		{
			sum += primes.get(i);
		}
		System.out.println("Sum of primes below 2 millon : "+sum);
	}

	static ArrayList<Integer> getPrimesTo(int limit) 
	{
		ArrayList<Integer> result = new ArrayList();
		
		boolean[] notPrimes = new boolean[limit - 1];
		
		int max = (int)Math.sqrt(limit);
		
		for(int i = 0; i <= max; i++)
		{
			if(notPrimes[i] != true)
			{
				int number = i+2;
				
				if(isPrimeNumber(number))
				{
					for(int j = 2; j*number - 2 < notPrimes.length; j++)
					{
						notPrimes[j*number - 2] = true;
						
					}
				}
				else
				{
					notPrimes[i] = true;
				}
			}
			
		}
		
		for(int i = 0; i<notPrimes.length; i++)
		{
			if(!notPrimes[i])
			{
				result.add(i+2);
			}
		}
 		return result;
	}

	static boolean isPrimeNumber(int number) 
	{
		boolean result = true;
		
		for(int i = 2; i< number; i++)
		{
			if(number%i == 0)
			{
				result = false;
				break;
			}
		}
		return result;
	}
}

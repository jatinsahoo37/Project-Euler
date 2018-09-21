//10001st prime
public class prj7 
{
	public static void main(String[] args) 
	{
		int i = 2;
		 for(int j = 0; j < 10001; i++)
		 {
			 if(isPrime(i))
				 j++;
		 }
		 System.out.println(i - 1);
	}

	static boolean isPrime(int a) 
	{
		boolean res = true;
		
		for(int i = 2; i<a; i++)
		{
			if(a % i == 0)
			{
				res = false;
				break;
			}
		}
		
		return res;
	}
}

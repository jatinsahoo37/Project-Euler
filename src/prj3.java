//Largest prime factor

public class prj3 
{
	public static void main(String[] args) 
	{
		long n = 600851475143L;
		
		long a = n;
		long b = 0;
		
		String result = "";
		
		do {
			b = a;
			for (int i = 2; i <= Math.sqrt(a); i++) 
			{
				if (a%i == 0) {
					b = i;
					break;
				}
			}
			System.out.println("The largest prime factors of "+n+" is : "+b);
			
			result += b+" x ";
			
			if(b<a)
				a = a/b;
		
		}while(b<a);
		
		String print = result.substring(0, result.length() - " x ".length());
		
		System.out.println(print + " = " +n);
	}
	
	
}

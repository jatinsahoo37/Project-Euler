//Even Fibonacci numbers
public class prj2 
{
	public static void main(String[] args) 
	{
		int n =0;
		int a = 1;
		int b = 2;
		
		while(a <=4000000)
		{
			if(a%2 == 0)
				n=n+a;
			
			int c = a;
			a = a+b;
			b = c;
			
		}
		System.out.println("The sum of the even fibonacci series under 4 million is :" +n);
	}
}

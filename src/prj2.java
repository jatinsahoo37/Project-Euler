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
				n+=a;
			
			int c = a+b;
			a = b;
			b = c;
			
		}
		System.out.println(n);
	}
}

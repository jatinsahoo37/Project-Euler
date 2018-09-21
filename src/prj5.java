//Smallest multiple
public class prj5 
{
	public static void main(String[] args) 
	{
        System.out.println(findSmallestMultiple(20));
    }
    
    
    public static long findSmallestMultiple(int n) 
    {
        for (long i = n; i <= factorial(n); i += n) 
        {
            if (isMultiple(i, n)) 
            	return i;
        }
        return -1;
    }
     
    public static boolean isMultiple(long x, int n) 
    {
        for (int i = 1; i < n; i++) 
        {
            if (x % i != 0) 
            	return false;
        }
        return true;
    }
    
    public static long factorial (long n) {
        if (n > 1) 
        	return n * factorial(n - 1);
        else if (n >= 0) 
        	return 1;
        else 
        	return -1;

	}
}

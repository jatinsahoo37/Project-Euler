//Sum square difference

/*
 soS : sum of Squares
 Sos : Square of sums
 */
public class prj6 
{
	public static void main(String[] args) 
	{
		int soS = 0;
		int Sos = 0;
		
		for(int i = 1; i <=100; i++)
		{
			Sos += i;
			soS += i*i; 
		}
		
		System.out.println(Sos * Sos - soS);	
	}
}

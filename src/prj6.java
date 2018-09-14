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
		int sum = 0;
		
		for(int i = 0; i <=100; i++)
		{
			soS += (i*i);
			sum += i; 
		}
		
		Sos = sum*sum;
		
		System.out.println("Difference = "+(Sos - soS));	
	}
}

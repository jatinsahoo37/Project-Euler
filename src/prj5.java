//Smallest multiple
public class prj5 
{
	public static void main(String[] args) 
	{
		int res = 1;
		
		for(int i = 2; i<=20; i++)
		{
			res = LCM(i, res);
		}
		System.out.println("smallest multiple: "+res);
	}

	private static int LCM(int i, int res) 
	{
		
		return i * res / HCF(i, res);
	}

	private static int HCF(int i, int res) {
		
		if(res == 0)
			return i;
		else
			return HCF( res, i % res);
	}
}

package week1.day2;

public class IsPrimeNumber {

	public static void main(String[] args) 
	{
		int n=7;
		for(int i=0;i<=n;i++)
		{
			if(n%2==0)
			{
				System.out.println("Not a prime number");
				return;
			}
		}
		System.out.println("It is a prime number");
	}

}

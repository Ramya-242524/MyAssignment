package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args)
	{
	int range=8;
	int firstnum=0, secondnum=1;
	for(int i=0;i<range;i++)
	{
		System.out.println(firstnum);
		int thirdnum=firstnum+secondnum;
		firstnum=secondnum;
		secondnum=thirdnum;
	}
	}
}

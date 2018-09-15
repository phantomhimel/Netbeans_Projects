public class ClassOfFInal {

	private int sum=0;
	private final int Number;
	
	public ClassOfFInal(int x)
	{
		Number = x;
	}
	
	public void add()
	{
		sum+= Number;
	}
	
	public String toString()
	{
		return String.format("Sum = %d\n", sum);
	}
}

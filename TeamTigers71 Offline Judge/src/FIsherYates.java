import java.util.Random;


public class FIsherYates {

	public static void main(String[] args) {
		String name[] = {"Elias Vai", "Shunjid", "Fahad"};
		Object[]  bride = {3,4,5};
		Object[]  year = {2023,2040,2025};
		shadi(name);
		shadi(bride);
		shadi(year);
		int i;
		for(i=0; i<name.length; i++)
		{
			System.out.print("[ "+name[i]+ " ]");
		}
		System.out.println();
		for(i=0; i<bride.length; i++)
		{
			System.out.print("[ "+bride[i]+ " ]");
		}
		System.out.println();
		for(i=0; i<year.length; i++)
		{
			System.out.print("[ "+year[i]+ " ]");
		}
		System.out.println();
	}
	
	public static void shadi(Object[] array)
	{
		Random num = new Random();
		int randomNumber=0;
	    Object  temporary;
		for(int i=0; i<array.length; i++)
		{
			randomNumber = num.nextInt(i+1);
			temporary = array[i];
			array[i]= array[randomNumber];
			array[randomNumber] = temporary;
		}
	}
}

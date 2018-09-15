import java.util.Arrays;
import java.util.Random;

public class FisherYatesbyShunjid {

	public static void main(String[] args) {
		
		String name[] = {"Elias vai", "Shunjid","Fahad","Anindo"};
		Integer year[] = {2012,2025,2031,2020};
		Integer bride[]= {2,5,3,4};
		
		shuffle(name);
		shuffle(year);
		shuffle(bride);
		
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(year));
		System.out.println(Arrays.toString(bride));
	}
	
	public static <T> void shuffle(T [] arr)
	{
		Random rnd = new Random();
		T temp;
		for (int i = arr.length - 1; i > 0; i--)
		{
			int randomPos = rnd.nextInt(i + 1);
			if (randomPos != i) 
			{
				temp = arr[randomPos];
				arr[randomPos] = arr[i];
				arr[i] = temp;				
			}
		}
	}

}

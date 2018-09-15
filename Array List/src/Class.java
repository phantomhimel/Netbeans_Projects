import java.util.ArrayList;
import java.util.Collections;

public class Class {

	int indextofarray = -1;
	int flag = 0;
	public int array(ArrayList<Double> myFindArrayList, double elementToSearch)
	{
		indextofarray = Collections.binarySearch(myFindArrayList, elementToSearch);
		flag = 1;
		return indextofarray;
	}
	
}

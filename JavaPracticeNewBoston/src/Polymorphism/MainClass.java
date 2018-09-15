package Polymorphism;

public class MainClass {
	public static void main(String[] args) {
		
		food obj[] = new food[2];
		obj[0] = new potpie();
		obj[1] = new tuna();
		
		for(int i=0; i<2; i++)
		{
			obj[i].eat();
		}
		
		
		fatty obj1 = new fatty();
		food Food = new food();
		obj1.digest(Food);
	}

}

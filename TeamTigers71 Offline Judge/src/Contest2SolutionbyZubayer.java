import java.util.Scanner;

public class Contest2SolutionbyZubayer {

	static Scanner myScanner= new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Destination longitude in degree: ");
		double des_longitude = myScanner.nextDouble();
		System.out.print("Destination latitude in degree: ");
		double des_latitude = myScanner.nextDouble();
		System.out.print("Starting longitude in degree: ");
		double sta_longitude = myScanner.nextDouble();
		System.out.print("Starting letitude in degree: ");
		double sta_letitude = myScanner.nextDouble();
		
		Distance(des_longitude,des_latitude,sta_longitude,sta_letitude);
	}
	
	static void Distance(double des_lo, double des_la, double sta_lo, double sta_la) {
		
		double a = Math.toRadians(des_la)-Math.toRadians(sta_la);
		double b = Math.toRadians(des_lo)-Math.toRadians(sta_lo);
		

		double calculation = (Math.sin(a/2)*Math.sin(a/2)) + Math.cos(Math.toRadians(sta_la)) * Math.cos(Math.toRadians(des_la)) * (Math.sin(b/2)* Math.sin(b/2));		
		double calculation2 = 2* Math.atan2(Math.sqrt(calculation), Math.sqrt(1-calculation));
		
		System.out.println("\nLet the radious of the earth is 6378.16\n\n");
		
		double total_distance= 6378.16*calculation2;
		
		System.out.format("Showrov the fucking asshole has to travel %.2f kilometres for pink pussy.", total_distance);
		
		
	}

}

import java.util.Random;
import java.util.Scanner;

public class RoyalCasino {

	static Scanner myScanner = new Scanner(System.in);
	public static void main(String[] args) {

		System.out.println("~~~~~~ WELCOME PLAYERS ~~~~~~");
		Dicegame();
	}
	
	public static void Dicegame() {
		
		int i,dnumber=0;
		int [] winner= new int [20];
		Random dice= new Random();
		int counter=0,flag=0,t=0;
		do {
			
			System.out.println("\n\nTrial number: "+ ++t);
			System.out.print("How many players: ");
		    double player= myScanner.nextDouble();
			System.out.print("Enter amount of bet per person: ");
		    double bet= myScanner.nextDouble();
		    double total= bet*player;
			System.out.println("Sum of bet is: "+total);
			System.out.println();
			for (i = 1; i <= player; i++) {
			    dnumber=1+dice.nextInt(6);
				System.out.print("Player["+i+"]: "+dnumber);
				System.out.println();
				if (dnumber==6) {
					flag=1;
					winner[i]=dnumber;
					counter++;
				}
			}
			if (flag==1) {
				
				WinnerOfDice (player, total, counter, winner);
			}
		} while (dnumber!=6);
	}
	
	public static void WinnerOfDice(Double a, double b,int counter, int[] algo) {
		
		for(int j=1; j<=a; j++) {
			
			if (algo[j]==6) {
				
				System.out.println("\nWinner Player ["+j+"]: "+b/counter); 
			}
		}
		System.out.println("Thanx for playing");
		System.exit(0);
	}

}

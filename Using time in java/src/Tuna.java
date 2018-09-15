
public class Tuna {

	 int hour;
	 int minute;
	 int second;
	
	public void settime(int h, int m, int s) {
		
		hour= ((h>=0 && h<24)? h : 0);
		minute= ((m>=0 && m<60)? m : 0);
		second= ((s>=0 && s<60)? s : 0);
	}
	
	public void militarytime() {
		
	    System.out.format("%02D:%02D:%02D", hour, minute, second);
	}
}

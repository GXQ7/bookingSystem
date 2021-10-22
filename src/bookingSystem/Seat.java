package bookingSystem;

public class Seat {

	private static String seatNo;
	private static String eMail;
	private String seatClass;
	private boolean isWindow, isAisle, isTable;
	private double seatPrice;
	private static int [] seat;


	public Seat(String seatNo, String seatClass, boolean isWindow, boolean isAisle, boolean isTable,
			double seatPrice, String eMail) {
		Seat.seatNo = seatNo;
		this.seatClass = seatClass;
		this.isWindow = isWindow;
		this.isAisle = isAisle;
		this.isTable = isTable;
		this.seatPrice = seatPrice;
		Seat.eMail = eMail;
		Seat.seat = seat;
	}


	/** Creating a toString method to return the formatted string along with the elements from the seat Array.*/
	public String toString() {
		String result = "Seat Number: %s Seat Class: %s Window Seat: %s Aisle Seat: %s Table: %s Seat Price: %.2f Email: %s", seatNo,seatClass,isWindow,isAisle,isTable,seatPrice,eMail;
		for (int i = 0; i < seat.length; i++) {
			result += " " + seat[i];
			}   return result; 
	}
	
	public static void load(){
		
	}
	

	public static boolean reserved(){
		for (int i = 0; i < seat.length; i++) {
		if (!eMail.equals(" ")){

		}
		}
		return false;
	}
	
	public static void cancel(){
		
			  }

		
		}




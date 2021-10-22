package bookingSystem;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class BookingSystem {

	private static Scanner Console, File;
	private static final ArrayList<Seat> SEATS = new ArrayList<Seat>(); //ArrayList of Seat Objects
	private static String PATH = "C:\\Users\\Grace\\Desktop\\Introduction to Programming\\Coursework\\seats.txt";
	
	public static void main(String[] args) throws FileNotFoundException{ 

	int choice = 0;
		
		
		/** A Do-While loop to loop through the Menu System, until the user has selected the Quit option. */
	do { //Menu System
	System.out.println("-- Seat Booking System --\n");
	System.out.println("-- MAIN MENU --");
	System.out.println(" 1 - Reserve Seat \n 2 - Cancel Seat \n 3 - View Seat Reservations \n 4 - Change the Path Location \n 5 - Quit");
	System.out.println("\nSelection an Option: ");
	
	choice = Integer.valueOf(Console.nextLine());
	
		/**Switch Statement for the selection within the Menu System 
		 * The user will select an appropriate option and the corresponding method will be invoked. */
			switch (choice) {
		
		case 1:
			reserveSeat();
			break;
			
		case 2:
			cancelSeat();
			break;
		case 3:
			loadSeatReservations();	
			break;
		case 4:
			pathChange(); 
			break;
		case 5:
			System.out.println("-- GOODBYE --"); 
			Console.close();
			break;
		default: 
			System.out.println("You have selected an invalid option. Try Again.\n"); //Invalid Option
		}
		
	}
	
	while (choice != 5);
	}
	
	
	//Method for Loading Seat Reservations 
		public static void loadSeatReservations() {
	try {	File = new Scanner(new FileReader(PATH));

		while(File.hasNext()); {

			String seatNo = File.nextLine();
			String seatClass = File.nextLine();
			boolean isWindow = Boolean.parseBoolean(File.nextLine());
			boolean isAisle = Boolean.parseBoolean(File.nextLine());
			boolean isTable = Boolean.parseBoolean(File.nextLine());
			double seatPrice = Double.parseDouble(File.nextLine());
			String eMail = File.nextLine();
			
			String[] strs = SEATS.toArray(File.nextLine().split(" "));
			SEATS.add(new Seat(seatNo, seatClass, isWindow, isAisle, isTable, seatPrice, eMail));
		}

		for (int i = 0 ; i < strs.length; i++){
			System.out.println(strs[i]);
		}
			
		}
		
			catch (FileNotFoundException Ex) {
				System.out.println("The file is in the wrong location.");
			}
		finally {
			File.close();
		}
		}	
			
	
	public static void reserveSeat(){
		/**System.out.println("\n-- Reserving Seats --");*/
		System.out.println("Please enter your Seat Number: ");
		Integer seatNo = Integer.valueOf(Console.nextLine());
		System.out.println("Please enter your Emai: ");
		String eMail = Console.nextLine(); 
		
		if (SEATS.contains(eMail.equals(" "))); {
			System.out.println("There is a free seat!");
			SEATS.add(eMail);
		}

			System.out.println("There is no available seats!");
		
	}
	
	public static void cancelSeat(){
		System.out.println("\n--Cancelling a Seat--");
		
		System.out.println("Enter your email: ");
		String inputEmail = Console.next();
		
		if (SEATS.contains(inputEmail)); {
			SEATS.remove(inputEmail);
		}

			System.out.println("The Email has not been registered on the system.");
	}
	
	public static void saveData(){
		System.out.println("\n--Saving Data --");
		try {
			PrintWriter fileOut = new PrintWriter(PATH);
			fileOut.print(toString());
			
		} 
		
		catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("There has been an error saving the file.");
		}
		
		finally {
			fileOut.close();
		}
	}
	
	
	/** Through this method the user will be able to define their own Path Location*/
	public static String pathChange(){
		System.out.println("-- Changing the Path Location --");
		System.out.println("Enter the new location of the path file: ");
		return PATH = Console.nextLine();
		
	}

		}
	
		



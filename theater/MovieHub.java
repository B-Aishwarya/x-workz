package com.xworkz.constructor.theater;

import java.util.Arrays;

import javax.sound.midi.SysexMessage;

public class MovieHub {
	private String theaterName;
	private String bookedBy;
	private int totalThickets;
	private String[] movieNames;
	private int thicketPrice = 100;
	private int noOfSnacks=1500;
	private int totalsnacksPrice=50;
	private String[] snacksName = { "popcorn", "chips", "samosa", "nachos" };

	public MovieHub(String theaterName, int totalThickets, String[] movieNames) {
		System.out.println("arg1" + theaterName);

		System.out.println("arg3" + totalThickets);
		System.out.println("arg3" + movieNames);
		this.theaterName = theaterName;

		this.totalThickets = totalThickets;
		this.movieNames = movieNames;
	}

	public double bookingTickets(String movieName, int noOfTickets, String bookedBy) {
		double totalPrice = 0;

		for (int kgf = 0; kgf < movieNames.length; kgf++) {
			String movie = movieNames[kgf];
			if (movieName.equals(movie)) {
				System.out.println("movie is available you can book tickets ");
				break;
			} else {
				System.out.println("movie not found search another movie name");
			}
		}
		if (noOfTickets <= totalThickets) {
			System.out.println("total tickets available " + totalThickets);
			totalThickets = totalThickets - noOfTickets;
			this.thicketPrice = thicketPrice * noOfTickets;
			System.out.println("price of thickets are" + thicketPrice);
			System.out.println("remaining tickets are: " + totalThickets);

		} else {
			System.out.println("there are no tickets");
		}
		return totalPrice;
	}

	public double buySnacks(String nameOfSnacks, int quantity, String seatNo, boolean selfService) {
		double totalPrice = 0;
	System.out.println("arg1" +nameOfSnacks);
	System.out.println("arg2" +quantity);
	System.out.println("arg3" +seatNo);
	System.out.println("arg4" +selfService);
	System.out.println(Arrays.toString(snacksName));
	for(int s=0; s<snacksName.length;s++) {
		String snacks=snacksName[s];
		if(nameOfSnacks.equals(snacks)) {
			System.out.println("snacks is available");
			
			if(quantity<=noOfSnacks) {
				System.out.println("quantity of snackes is available");
				  double price=quantity*totalsnacksPrice;
				  System.out.println("total price of snacks is" +price);
			}break;
		}
		else {
			System.out.println("snacks is not available");
		
			
		}
		
		
	}
		return totalPrice;

	}

	public String getTheaterName() {
		return theaterName;
	}

	public String getBookedBy() {
		return bookedBy;
	}

	public int getTotalThickets() {
		return totalThickets;
	}

	public String[] getMovieNames() {
		return movieNames;
	}

}

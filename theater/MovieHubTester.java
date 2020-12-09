package com.xworkz.constructor.theater;

import java.util.Arrays;

public class MovieHubTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] movieNames = { "kgf", "3-idiots", "scam-1992"};
		
		 MovieHub moviehub=new MovieHub("Nartaki", 500, movieNames );
			 System.out.println(moviehub.getTheaterName());	
			 System.out.println(moviehub.getTotalThickets());
			 String convertedMovieName=Arrays.toString(moviehub.getMovieNames());
			 System.out.println( convertedMovieName);
			 
			 moviehub.bookingTickets("kgf",10,"Aishwarya"); 
			 System.out.println(moviehub.buySnacks("popcorn", 100, "10", true));
			 
		
			
		 
		 
		 
	}
	

}
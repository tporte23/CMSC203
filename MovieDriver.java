package Lab1;

import java.util.Scanner;


public class MovieDriver {

	public static void main(String[] args) {
		
		boolean replay;
		Scanner input = new Scanner(System.in); //creating the scanner
		
		do {
	
	
		Movie myMovie = new Movie();
		
		System.out.println("Enter the name of a movie");
		String title = input.nextLine(); //movie title variable
		myMovie.setTitle(title); //Using the setTitle function to set the title
			
	
		System.out.println("Enter the rating of the movie");
		String rating = input.nextLine(); //movie rating
		myMovie.setRating(rating); //using the setRating function to set the rating
		
		
		System.out.println("Enter the number of tickets sold for this movie");
		int soldTickets = input.nextInt(); //ticket amount
		myMovie.setSoldTickets(soldTickets); //using the setSoldTickets function
		
		
		System.out.println(myMovie.toString());
		
		
		
		//Replay system
		System.out.println("Would you like to enter another movie? (y/n)");
		
		input.nextLine();
		String usersDesire = input.nextLine();
		
		if (usersDesire.equalsIgnoreCase("y") ) {
			replay = true;
		} else {
			replay = false;
		}
		
		
			
		} while (replay == true);
		
		input.close();
	}

}

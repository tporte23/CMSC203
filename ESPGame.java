package project1;

/*
 * Class: CMSC203 
 * Instructor: Grigoriy Grinberg
 * Description: Program tests the user's guessing abilities by letting the user guess
 * between 16, 10, and 5 colors, each instance the computer is thinking of a random color
 * that the user has to guess.
 * Due: 06/15/2025
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Thomas Porter
*/


import java.util.Scanner;
import java.util.Random;
import java.io.*;
import java.io.FileNotFoundException;

public class ESPGame { //This is a game testing our ESP abilities!

	public static void main(String[] args) { //Main function
		//System.out.println("Hello World!");
		//Making sure Eclipse was working! ^^
		
		boolean playAgain = true;
		do {
		
		//Defining the string vars for the colors. used for RNG method
		final String black = "black",
					white = "white",
					gray = "gray",
					silver = "silver",
					maroon = "maroon",
					red = "red",
					purple = "purple",
					fuchsia = "fuchsia",
					green = "green",
					lime = "lime",
					olive = "olive",
					yellow = "yellow",
					navy = "navy",
					blue = "blue",
					teal = "teal",
					aqua = "aqua";
					
		
		//First Menu, giving the user options for what to do.
		System.out.println("Welcome to ESP - extrasensory perception!" + "\nWould you please choose one of the 4 options from the menu: \n");
		System.out.println("1-  Read and display on the screen first 16 names of colors from a file colors.txt, so the player can select one of them names of colors.");
		System.out.println("2-	Read and display on the screen first 10 names of colors from a file colors.txt, so the player can select one of them names of colors.");
		System.out.println("3-	Read and display on the screen first 5 names of colors from a file colors.txt, so the player can select one of them names of colors.");
		System.out.println("4-	Exit from the program.");
		
		//Prompt for the user's choice
		System.out.println("\nEnter a number to make your choice:");
		
		//defining user input variable
		int input;
		String fileName;
		
		//creating scanner
		Scanner keyboard = new Scanner(System.in);
		
		//Assigning scanner to 'input'
		int maxColors = 0; //maxColors is deciding how much colors the game part of the program will use
		input = keyboard.nextInt();
		if (input == 1) {
			maxColors = 16;
		} else if (input == 2) {
			maxColors = 10;
		} else if (input == 3) {
			maxColors = 5;
		} else {
			//some exit clause, will google.
		}
		
		
		Scanner fileScanner = null;
		
		while (true) {
		    System.out.print("Enter the file name: ");
		    fileName = keyboard.nextLine();
		  

		    try {
		        fileScanner = new Scanner(new File(fileName)); // can throw FileNotFoundException
		        break;  // success, break out of loop
		    } catch (FileNotFoundException e) {
		        System.out.println("File not found. Please try again.");
		    }
		}
		
	
		
		
		
		
		System.out.println("There are " + maxColors + " colors in the file:");
		
		try {
		    Scanner inputFile = new Scanner(new File(fileName));
		    int count = 0;

		    while (inputFile.hasNextLine() && count < maxColors) {
		        String color = inputFile.nextLine();
		     
		        System.out.println(color);
		        count++;
		    }

		    inputFile.close();
		} catch (FileNotFoundException e) {
		    System.out.println("Error: File not found.");
		}
		
		int number,
			i,  //declaring random number var and counter var i
			correctCounter = 0; //How many the user gets correct
		String userSelection, //User's selection
				colorString = ""; //converted string from computer's rng value
		Random randomNumbers = new Random(); //making it random
			
		//For loop for playing the game
		for (i = 0; i < 3; i++) {
			number = randomNumbers.nextInt(maxColors) + 1; 
			System.out.println("I am thinking of a color. \nIt is one of the colors in the list above. \nEnter your guess:");
			userSelection = keyboard.nextLine();
		
			
			//Converting RNG int to a color
			switch (number) {
			case 1: 
				System.out.println("I was thinking of " + black);
				if (userSelection.equalsIgnoreCase(black)) {
					correctCounter++;
				}
				break;
			case 2:
				System.out.println("I was thinking of " + white);
				if (userSelection.equalsIgnoreCase(white)) {
					correctCounter++;
				}
				break;
			case 3:
				System.out.println("I was thinking of " + gray);
				if (userSelection.equalsIgnoreCase(gray)) {
					correctCounter++;
				}
				break;
			case 4:
				System.out.println("I was thinking of " + silver);
				if (userSelection.equalsIgnoreCase(silver)) {
					correctCounter++;
				}
				break;
			case 5:
				System.out.println("I was thinking of " + maroon);
				if (userSelection.equalsIgnoreCase(maroon)) {
					correctCounter++;
				}
				break;
			case 6:
				System.out.println("I was thinking of " + red);
				if (userSelection.equalsIgnoreCase(red)) {
					correctCounter++;
				}
				break;
			case 7: 
				System.out.println("I was thinking of " + purple);
				if (userSelection.equalsIgnoreCase(purple)) {
					correctCounter++;
				}
				break;
			case 8:
				System.out.println("I was thinking of " + fuchsia);
				if (userSelection.equalsIgnoreCase(fuchsia)) {
					correctCounter++;
				}
				break;
			case 9:
				System.out.println("I was thinking of " + green);
				if (userSelection.equalsIgnoreCase(green)) {
					correctCounter++;
				}
				break;
			case 10:
				System.out.println("I was thinking of " + lime);
				if (userSelection.equalsIgnoreCase(lime)) {
					correctCounter++;
				}
				break;
			case 11:
				System.out.println("I was thinking of " + olive);
				if (userSelection.equalsIgnoreCase(olive)) {
					correctCounter++;
				}
				break;
			case 12:
				System.out.println("I was thinking of " + yellow);
				if (userSelection.equalsIgnoreCase(yellow)) {
					correctCounter++;
				}
				break;
			case 13:
				System.out.println("I was thinking of " + navy);
				if (userSelection.equalsIgnoreCase(navy)) {
					correctCounter++;
				}
				break;
			case 14:
				System.out.println("I was thinking of " + blue);
				if (userSelection.equalsIgnoreCase(blue)) {
					correctCounter++;
				}
				break;
			case 15:
				System.out.println("I was thinking of " + teal);
				if (userSelection.equalsIgnoreCase(teal)) {
					correctCounter++;
				}
				break;
			case 16:
				System.out.println("I was thinking of " + aqua);
				if (userSelection.equalsIgnoreCase(aqua)) {
					correctCounter++;
				}
				break;
			}
		}
		
		System.out.println("Game over");
		System.out.println("You guessed " + correctCounter + " out of 3 correctly.");
		System.out.println("Would you like to play again? Type Yes/No: ");
		
		String retry = ""; //retry variable 
		
		retry = keyboard.nextLine();
		keyboard.nextLine();
		if (retry.equalsIgnoreCase("no")) {
			playAgain = false;
		}
		
		
		keyboard.close(); //good practice for end of code =)
		
		} while (playAgain); //end of the looping function for retrying
		
	}

}

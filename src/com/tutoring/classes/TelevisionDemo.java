package com.tutoring.classes;

import java.util.Scanner;
/**
 * Television Driver
 * @author alexJenkins
 * @course Java Full Stack Development 
 * @section Core-Java
 * @instructor Ms.Lewis
 * @date 12/03/22
 */
public class TelevisionDemo {

	public static void main(String[] args) {
		
		
		
		// Create a Scanner object to read from the keyboard
	      Scanner keyboard = new Scanner (System.in);
	      // Declare variables
	      int station; // The user's channel choice
	      // Declare and instantiate a television object
	      Television bigScreen = new Television("Toshiba", 55);
	      // Turn the power on
	      bigScreen.power();
	      // Display the state of the television
	      System.out.println("A " + bigScreen.getScreenSize() + " inch " + bigScreen.getManufacturer() + " has been turned on.");
	      // Prompt the user for input and store into station
	      System.out.print("What channel do you want? ");
	      station = keyboard.nextInt();
	      // Change the channel on the television
	      bigScreen.setChannel(station);
	      // Increase the volume of the television
	      bigScreen.increaseVolume();
	      // Display the the current channel and
	      // volume of the television
	      System.out.println("Channel: " + bigScreen.getChannel() + " Volume: " + bigScreen.getVolume());
          System.out.println("Too loud! Lowering the volume.");
	          
          // Decrease the volume of the television
          	bigScreen.decreaseVolume();
       		bigScreen.decreaseVolume();
       		bigScreen.decreaseVolume();
       		bigScreen.decreaseVolume();
       		bigScreen.decreaseVolume();
       		bigScreen.decreaseVolume();
	           
       		// Display the the current channel and
	        // volume of the television
           	System.out.println("Channel: " + bigScreen.getChannel() + " Volume: " + bigScreen.getVolume());
           	System.out.println();
		
		
		/**
		 * TASK 5
		 */
		//3
		Television portabe = new Television("Sharp", 19);
		//4
		portabe.power();
		//5
		// Display the state of the television
	    System.out.println("A " + portabe.getScreenSize() + " inch " + portabe.getManufacturer() + " has been turned on.");
		
		
		//6
	    
	    
	    System.out.print("What channel do you want? ");
	    station = keyboard.nextInt();
		
	    
	    portabe.setChannel(station);
	      // Increase the volume of the television
	    for(int i=0; i<2; i++) {
	    	portabe.decreaseVolume();
	    }
		//7
	    System.out.println("Channel: " +portabe.getChannel() + " Volume: " + portabe.getVolume());
		
	}

}

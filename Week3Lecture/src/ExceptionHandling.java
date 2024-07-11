/* Objective: Receive 2 integers and outputs a string with a calculated sum. 
 * Will catch input mismatch exceptions and prompt the user to try again.
 * Created by: Eduardo Enriquez L20601685
 * Date: 6/19/2024
 * Version:1.0
 */

import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionHandling {

	public static void main(String[] args) {
		
		//create a scanner to take in console inputs
		Scanner in = new Scanner(System.in);
		boolean retry = false;//create a boolean variable to determine whether to continue a loop.
		
		do {
			//outputs a request for the user to provide data.
			System.out.println("Please enter 2 integers.");
			
			try {			
			//takes in the next values in places them into variables int1 and int2.
			int int1 = in.nextInt();
			int int2 = in.nextInt();
			System.out.println(int1 + " + " + int2 + " = " + sum(int1, int2)); //prints the values and calculated sum
			retry = false;// sets the variable to false to stop the loop and continue with the rest of the program
				}
		
			catch(InputMismatchException exc){//if inputmismatchexception occurs it will run this block of code to inform the user and clear data and start over.
			System.out.println("Invalid integer detected, please try again.");
			retry = true;// sets variable retry to true to do the loop again.
			// clears the inputs to allow for fresh data
			in.nextLine();
				}//closes catch
		
		}//closes do loop
		while(retry);//Continue to do the loop while variable retry is true
		
	}//closes main method

	//a method that calculates the sum of 2 integers
	public static int sum(int first, int second) {
		return first + second;
	}//closes sum method
		
}//closes Class
/************************************************************
 * Purpose : Create a user registration system using regex.
 * @author Hrishikesh Ugavekar
 * @Version 1.0
 * @since 18-06-2021
 *
 ************************************************************/

package service;
import java.util.Scanner;
import java.util.regex.*;
import model.User;
public class Registration {
	//static user object of class User 
	static User user1 = new User();
	
	/**
	 * Gets the first name from console 
	 * Checks if it matches our regex pattern
	 * If it matches set the first name of object user1 to entered first nmae
	 * If not instruct what a correct name is and take first name again
	 */
	public static void getFirstName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name");
		String firstName= sc.next();
		boolean check = Pattern.matches("[A-Z]+[a-z]{2,}", firstName);
		if(check) {
			user1.setFirstName(firstName);
		}
		else {
			System.out.println("First name starts with Cap and has minimum 3 characters");
			getFirstName();
		}
	}
	
	public static void main(String[] args) {
		getFirstName();
	
	}

}

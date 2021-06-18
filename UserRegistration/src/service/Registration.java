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
	 * If it matches set the first name of object user1 to entered first name
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
	
	/**
	 * Gets the last name from console 
	 * Checks if it matches our regex pattern
	 * If it matches set the last name of object user1 to entered last name
	 * If not instruct what a correct name is and take last name again
	 */
	public static void getLastName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter last name");
		String lastName= sc.next();
		boolean check = Pattern.matches("[A-Z]+[a-z]{2,}", lastName);
		if(check) {
			user1.setLastName(lastName);
		}
		else {
			System.out.println("First name starts with Cap and has minimum 3 characters");
			getLastName();
		}
	}
	
	/**
	 * Gets the email address from console 
	 * Checks if it matches our regex pattern
	 * If it matches set the email of object user1 to entered email address
	 * If not tells user to enter email address again
	 */
	public static void getEmail() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Email Address");
		String email= sc.next();
		boolean check = Pattern.matches("^[a-z0-9.+-]+@[A-Za-z0-9.-]+.[A-Za-z]{2,6}$", email);
		if(check) {
			user1.setEmail(email);
		}
		else {
			System.out.println("Email invalid , enter correct email");
			getEmail();
		}
	}
	
	/**
	 * Checks for the correct phone number
	 * If correct assigns it to mobileNumber of object User
	 */
	public static void getPhoneNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your phone number");
		String phone= sc.next();
		boolean check = Pattern.matches("^[1-9][0-9]\s[1-9]{10}$", phone);
		if(check) {
			user1.setMobileNum(phone);
		}
		else {
			System.out.println("Phone number invalid , enter correct number");
			getPhoneNumber();
		}
	}
	public static void main(String[] args) {
		getFirstName();
		getLastName();
		getEmail();
		getPhoneNumber();
	}

}

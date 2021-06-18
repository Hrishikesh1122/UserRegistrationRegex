/*****************************************************************
 * Purpose : Model class for User, contains all the user features
 * @author Hrishikesh Ugavekar
 * @Version 1.0
 * @since 18-06-2021
 *
 ****************************************************************/
package model;
public class User {
	public String firstName;
	public String lastName;
	public String email;
	public String mobileNum;
	public String password;
	
	
	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", mobileNum="
				+ mobileNum + ", password=" + password + "]";
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNum() {
		return mobileNum;
	}
	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}

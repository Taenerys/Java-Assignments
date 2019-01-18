//Name: Anh Pham
//Student ID: 1805956
//Homework5
import java.util.Scanner;
public class Password {
	// use String and Array
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//at least 8 characters
		// only letters and digits
		// at least 2 digits
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your password: ");
		String password = input.nextLine();
		if (isLength(password) && isLettersAndDigits(password) && isTwoDigits(password)){
			System.out.println("Valid Password!");
		} else{
			System.out.println("Invalid Password!");
		}
	}
	
	public static boolean isLength(String password){
		final int PASSWORD_REQUIRED_LENGTH = 8;
		if (password.length() >= PASSWORD_REQUIRED_LENGTH){
			return true;
		}
		return false;
	}
	
	public static boolean isLettersAndDigits(String password){
		if (password.matches(".*[a-zA-Z].*") && password.matches(".*[0-9].*")){
			return true;
		}
		return false;
	}
	
	public static boolean isTwoDigits(String password){
		final int NUMBER_OF_DIGITS_REQUIRED = 2;
		int count = 0;
		for (int i = 0; i < password.length(); i++){
			char ch = password.charAt(i);
			if (Character.isDigit(ch)){
				count++;
			}
		}
		if (count >= NUMBER_OF_DIGITS_REQUIRED){
			return true;
		}
		return false;
	}
}

package validators;

public class PasswordValidator {
    public static boolean isValid(String input){
        //Checks if the password that is entered is valid
        //snej123- valid password-You need 4 letters and 3 numbersfor a valid password
        return input.matches("[a-zA-Z]{4}[0-3]{3}");
    }
}

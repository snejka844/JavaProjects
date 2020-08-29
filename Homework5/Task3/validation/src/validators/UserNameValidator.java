package validators;

public class UserNameValidator {

    //Check if the given username is valid
    //You need only letters and at least two
    public static boolean isValid(String input){
        return input.matches("[a-zA-Z]{2,}");
    }
}

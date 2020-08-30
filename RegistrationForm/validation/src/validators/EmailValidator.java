package validators;

public class EmailValidator {

    public static boolean isValid(String input){
        //Checks if the Email that is entered is a valid one
        //It makes sure that the dots are only one there can't be a dot after another one
        //example of a valid email is snejka@gmail.com
        return input.matches("([a-zA-Z]+([.]|[0-9]*|[a-zA-Z]|[_]))+[@][a-z]+[.][a-z]+");
    }
}

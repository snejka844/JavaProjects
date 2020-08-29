package validators;

public class PhoneValidator {

    //check is the entered phone is valid one
    //You need  ( and exactly 4 numbers and ) than space than ( and exactly 7 numbers and )
    public static boolean isValid(String input){
        return  input.matches("[(][0-9]{4}[)][ ][(][0-9]{7}[)]");
    }
}

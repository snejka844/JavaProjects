package provide;

import service.Cipherable;

public class CipherGenerator {
    public static Result countDistinct(Cipherable cipher, int seed){
        char[] Array = cipher.getSecretChars(seed);
        char currentElement;
        boolean elementExist = false;
        int info = 0;
        for(int i = 0; i < Array.length - 1; ++i)
        {
            currentElement = Array[i];
            for(int j = i + 1; j < Array.length; ++j)
            {
                if(currentElement == Array[j])
                {
                    elementExist = true;
                    break;
                }
            }
            for(int k = i - 1; k >= 0; --k)
            {
                if(currentElement == Array[k])
                {
                    elementExist = true;
                    break;
                }
            }
            if(elementExist == false)
            {
                ++info;
            }
        }
        return new Result(Array, info);
    }

}

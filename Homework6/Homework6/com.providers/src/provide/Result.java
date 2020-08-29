package provide;

import java.util.Arrays;

public class Result {
    private char[] chars;
    private int data;

    public char[] getChars() {
        return chars;
    }

    public void setChars(char[] chars) {
        this.chars = chars;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data < 0 ? 1 : data;
    }

    public Result(char[] chars, int data) {
        setChars(chars);
        setData(data);
    }

    @Override
    public String toString() {
        return String.format("Array values are: %s,\n Data value is: &d",
                Arrays.toString(getChars()), getData());
    }
}

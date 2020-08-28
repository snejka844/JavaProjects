import java.util.Scanner;

public class MonetaryCoinTest {
    public static void main(String[] args) {

        int value = 0;
        Scanner n = new Scanner(System.in);
         value = n.nextInt();
        MonetaryCoin test = new MonetaryCoin(Face.HEAD,value);
        test.flip();
        test.flip();
    }


}

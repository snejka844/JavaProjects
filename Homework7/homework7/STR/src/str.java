import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;


public class str {



    public static void main(String[] args) {

        IntStream rng = IntStream.rangeClosed(1, 100);
        rng.forEach(System.out::print);
        System.out.println();


        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            numbers.add(i);

        }

        Collections.shuffle(numbers);
        //   System.out.println(numbers);

        List<Integer> myList = new ArrayList<>();
        for (int y = 0; y < 20; y++) {
            myList.add(numbers.get(y));
        }
        System.out.println(myList);

        boolean anw = myList.stream().anyMatch(x -> x % 5 == 0);// dali ima chislo koeto se deli na 5
        System.out.println(anw);


        boolean answer = myList.stream().allMatch(i -> i < 15); // dali vsichki chisla sa po malki ot 15
        System.out.println(answer);

          double  avr = myList.stream().mapToInt(num-> num).average().orElse(0.0);
          if (myList.stream().filter(num->num>avr).count()> 5)
          {
              System.out.println("Yes");
          }
          else
          {
              System.out.println("No");
          }

    }

}

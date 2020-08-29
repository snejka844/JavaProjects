package provide;

import service.Cipherable;

import java.util.Random;

public class Wrapper {
    private int size;

    public Wrapper(int size) {
        setSize(size);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size < 0 ? 1 : size;
    }

    Cipherable makeFixedSelection(){

        FixedRandom fixedRandom = new FixedRandom();
        return fixedRandom;

    }

    Cipherable makeFixedRandom(){

        FixedSelection fixedSelection=new FixedSelection();
        return fixedSelection;

    }

    public class FixedRandom implements Cipherable{
        @Override
        public char[] getSecretChars(int seed) {

            Random random = new Random(seed);

            char[] array = new char[size];

            for (int i = 0; i < seed; i++){

                array[i] = (char)(random.nextInt(26) + 'A');

            }

            return array;
        }
    }

    public class FixedSelection implements Cipherable{
        @Override
        public char[] getSecretChars(int seed) {
            Random rn = new Random();

            char[] charArray = new char[size];
            char[] charOfSeed = new char[seed];

            for (int i = 0; i < seed; i++){

                charOfSeed[i] = (char)(rn.nextInt(26) + 'A');

            }
            int index = 0;

            for (int i = 0; i < size; i++){

                index = rn.nextInt(seed);
                charArray[i] = charOfSeed[index];

            }

            return charArray;
        }
    }
}

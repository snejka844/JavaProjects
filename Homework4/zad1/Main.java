package com.company;


import java.util.Scanner;


class Main
{
    // function to calculate Hamming distance using string
    //Using this function we can calculate the distance using binary numbers that we enter
    static int hammingDistanceString(String codeword1, String codeword2)
    {
        int i = 0, count = 0;
        while (i < codeword1.length())
        {
            if (codeword1.charAt(i) != codeword2.charAt(i)) {
                count++;
            }
            i++;
        }
        return count;
    }

    // function to calculate Hamming distance using int
    //Using this function we can calculate the distance using decimal numbers that we enter
    static int hammingDistance(int number1, int number2)
    {
        int x = number1 ^ number2;
        int setBits = 0;

        while (x > 0)
        {
            setBits += x & 1;
            x >>= 1;
        }

        return setBits;
    }

    // Driver code
    public static void main (String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter 2 numbers that you want to calculate the hamming distance between: ");


        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        System.out.print("The hamming distance between ");
        System.out.print(Integer.toString(number1,2));
        System.out.print(" and ");
        System.out.print(Integer.toString(number2,2));
        System.out.println(" is: ");
        // function call
        System.out.println(hammingDistance (number1, number2));


        //prints the numbers in 8-bit binary
        //String output1 = String.format("%8s", Integer.toString(number1,2)).replace(' ', '0');
        //System.out.println(output1);
        //String output2 = String.format("%8s", Integer.toString(number2,2)).replace(' ', '0');
        //System.out.println(output2);


        //use of the function hammingDistanceString
        //String code=scanner.nextLine();
        //String code1=scanner.nextLine();
        // System.out.println(hammingDistanceString (code, code1));




    }
}

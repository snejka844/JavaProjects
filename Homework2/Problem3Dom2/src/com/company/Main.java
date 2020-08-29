package com.company;

import java.text.NumberFormat;
import java.util.Random;


public class Main {
    public static int drawRandomNumber() {
        Random rand = new Random();
        int number = 1 + rand.nextInt(3);
        return number ;

    }

    public static void main(String[] args) {
        int counterForOne = 0;
        int counterForTwo = 0;
        int counterForThree = 0;
        for(int i = 0 ; i<10000 ; i++)
        {
            int number=drawRandomNumber();
            //System.out.println(number);
            switch (number)
            {
                case 1 : counterForOne++;break;
                case 2 : counterForTwo++;break;
                case 3 : counterForThree++;break;
            }


        }

//  pri 10000 izvikvaniq
//presmqtane na procent za 1

        double percentForOne = counterForOne / 10000.0;
        NumberFormat percentFormatter ;
        String percentOutForOne = null;

        percentFormatter = NumberFormat.getPercentInstance();
        percentOutForOne = percentFormatter.format(percentForOne);
        System.out.println("The percent for one in 10000 loop is:" + percentOutForOne);

//presmqtane na procent za 2

        double percentForTwo = counterForTwo / 10000.0;

        String percentOutForTwo = null;

        percentFormatter = NumberFormat.getPercentInstance();
        percentOutForTwo = percentFormatter.format(percentForTwo);
        System.out.println("The percent for two in 10000 loop is:" + percentOutForTwo);

// presmqtane na procent za 3
        double percentForThree = counterForThree/ 10000.0;

        String percentOutForThree= null;

        percentFormatter = NumberFormat.getPercentInstance();
        percentOutForThree = percentFormatter.format(percentForThree);
        System.out.println("The percent for three in 10000 loop is: " + percentOutForThree);




        // pri 60000 povtoreniq
        counterForOne = 0;
        counterForTwo = 0;
        counterForThree = 0;
        for(int i = 0 ; i<60000 ; i++)
        {
            int number=drawRandomNumber();
            //System.out.println(number);
            switch (number)
            {
                case 1 : counterForOne++;break;
                case 2 : counterForTwo++;break;
                case 3 : counterForThree++;break;
            }


        }

        //presmqtane na procent za 1

        percentForOne = counterForOne / 60000.00;

        percentOutForOne = null;

        percentFormatter = NumberFormat.getPercentInstance();
        percentOutForOne = percentFormatter.format(percentForOne);
        System.out.println("The percent for one in 60000 loop is:" + percentOutForOne);


//presmqtane na procent za 2

        percentForTwo = counterForTwo / 60000.00;

        percentOutForTwo = null;

        percentFormatter = NumberFormat.getPercentInstance();
        percentOutForTwo = percentFormatter.format(percentForTwo);
        System.out.println("The percent for two in 60000 loop is:" + percentOutForTwo);

// presmqtane na procent za 3
        percentForThree = counterForThree/ 60000.00;

        percentOutForThree= null;

        percentFormatter = NumberFormat.getPercentInstance();
        percentOutForThree = percentFormatter.format(percentForThree);
        System.out.println("The percent for three in 60000 loop is: " + percentOutForThree);
    }
}



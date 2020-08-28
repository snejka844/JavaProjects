package com.company;

public class Main {

    public static void main(String[] args) {
        MonetaryCoin mc1 = new MonetaryCoin( 25 );
        MonetaryCoin mc2 = new MonetaryCoin( 13 );
        MonetaryCoin mc3 = new MonetaryCoin( 33 );
        MonetaryCoin[] test = new MonetaryCoin[2];
        //test[0] = mc2;
        //test[1] = mc3;
        int total = mc1.add(test);
        //int value = mc2.getValue();
        //System.out.println("total: " +total+ " values: " +value);
        System.out.println("total: " +total+ " values: " );

    }
}

package com.company;

public class MonetaryCoinTest {

    public static void main(String[] args) {
        MonetaryCoin coin=new MonetaryCoin(Face.TAIL,20);

        //flip a coin 50 times and print to check if the fliping is working right
        for(int i=0;i<50; i++){
            coin.flip();
            System.out.println(coin);
        }


        MonetaryCoin coin1=new MonetaryCoin(Face.HEAD,100);
        //print to see the sum of too coins
        System.out.println(coin.getValue()+coin1.getValue());
    }
}

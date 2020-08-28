package com.company;

import java.util.Random;

public class Coin
{
    private final int HEADS = 0;
    private final int TAILS = 1;
    //private int face;
    Face face;
    Random rand;
    // Constructor... sets up the coin by flipping it initially
    public Coin()
    {
        flip();
    }

    // flips the coin by randomly choosing a face value
    public void flip()
    {
         //rand= (Math.random()*2);  //random numbers 0 or 1
        rand=new Random();
        for(int i=0;i<=1;i++){
            int randomNumber=rand.nextInt(2);
            //System.out.println(randomNumber);
        }
    }

    // returns true if the current face of the coin is head

    public boolean isHeads()
    {
        return (Face.HEADS.toString() == "HEADS");
    }

    // returns the current face of the coin as a string

    /*public String toString()
    {
        String faceName;
        if(face==HEADS)
        { faceName = "Heads"; }
        else
        { faceName = "Tails"; }
        return faceName;
    }*/
}


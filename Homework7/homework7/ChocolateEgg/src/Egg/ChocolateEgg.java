package Egg;

import java.util.ArrayList;
import java.util.Random;
import java.util.TreeSet;

public class ChocolateEgg {
private TreeSet tree ;
private  TreeSet treeEggWithHerous;


    public ChocolateEgg()
{
    tree = new TreeSet();
    treeEggWithHerous = new TreeSet();
}

    public  int randNumber()
    {
        Random rand = new Random();
        int number = rand.nextInt(10);
        return number;
    }







    public static void main(String[] args) {
        ChocolateEgg egg = new ChocolateEgg();
        double result = 0;
        for(int i = 0;i <10;i++)
        {
            egg.treeEggWithHerous.add(i);
        }

        for(int i = 0;i < 1000 ; i ++)
        {
            do {
                egg.tree.add(egg.randNumber());
                result +=0.5;
            }while(!egg.tree.equals(egg.treeEggWithHerous));
                egg.tree.clear();
        }

        System.out.print("The averGE IS  :" + result/1000);

    }
}

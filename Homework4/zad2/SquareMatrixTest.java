package com.company;

import java.util.concurrent.ThreadLocalRandom;

public class SquareMatrixTest {


    public static void main(String[] args) {

        SquareMatrix mat=new SquareMatrix();
        int randomInt = ThreadLocalRandom.current().nextInt(2, 13);
        //mat.n = randomInt;
        mat.setN(randomInt);
        //mat.dataArray = new int[mat.n][mat.n];
        mat.setDataArray();


        for(int i = 0; i < mat.getN(); i++)
        {
            for(int j = 0; j < mat.getN(); j++)
            {
                int data = ThreadLocalRandom.current().nextInt(0, 8);
                //mat.dataArray[i][j] = data;
                mat.setValue(i,j,data);
            }
        }


        mat.printSumSimple();

        System.out.println(mat.toString());

    }

}

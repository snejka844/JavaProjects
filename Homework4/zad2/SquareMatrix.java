package com.company;

import java.util.ArrayList;
import java.util.List;


public class SquareMatrix {

    private static int[][] dataArray;
    private static int n;

    List<Integer> list = new ArrayList<>();


    //default constructor
    public SquareMatrix() {
        dataArray = new int[2][2];
        n = dataArray.length;
    }


    //Create a matrix from array values
    public SquareMatrix(int[][] dataArray,int n) {
        this.dataArray = dataArray;
        this.n = n;
    }

    //copy constructor
    public SquareMatrix(SquareMatrix other){
        System.out.println("Copy constructor called");
        dataArray=other.dataArray;
        n=other.n;
    }
    //--Public methods

    //Get a specific matrix value by coordinate
    public int getDataArray(int row, int col) { return dataArray[row][col]; }

    //Set a specific matrix value by coordinate
    public void setValue(int row, int col, int value) { dataArray[row][col] = value; }

    //set data array
    public void setDataArray(){dataArray=new int [getN()][getN()];}

    //get n
    public int getN(){return n;}

    //set n
    public void setN(int value){n=value;}

    //Return string representation of a Matrix
    public String toString() {
        String result = "";
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++)
                result += getDataArray(i, j) + " | ";
            result += "\n";
        }
        return result;
    }



    //return max sum of submatrix
    public  int findMaxSum(){

        final int k = 2;
        int max=0;

        // k must be smaller than or
        // equal to n
        if (k > n) System.out.println("Not valid n");

        // row number of first cell in
        // current sub-square of size k x k
        for (int i = 0; i < n-k+1; i++)
        {

            // column of first cell in current
            // sub-square of size k x k
            for (int j = 0; j < n-k+1; j++)
            {

                // Calculate and print sum of
                // current sub-square
                int sum = 0;
                for (int p = i; p < k+i; p++) {
                    for (int q = j; q < k + j; q++) {
                        sum += dataArray[p][q];

                    }
                }
                if(max<sum){
                    max=sum;
                    list.clear();
                    list.add(i);
                    list.add(j);

                }else if(max==sum){
                    list.add(i);
                    list.add(j);
                }

            }

        }

        //System.out.println(list);

        return max;
    }



    //print max sum and coordinates of submatrices
    public  void printSumSimple()
    {
        System.out.print("Maximum sum: ");
        System.out.println(findMaxSum());
        System.out.println("Submatrices with Maximum sum: ");
        System.out.println(list);
    }

}

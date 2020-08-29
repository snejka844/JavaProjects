package com.company;

import java.util.Scanner;
import java.util.stream.Collectors;


public class RouteCipher {


    private  int key;
    //constructor
    public RouteCipher(int key) {
        this.key = key;
    }

    public RouteCipher(){
        key = 0;
    }

    public int getKey(){
        return key;
    }
    public void setKey(int key) {
        this.key = key;
    }



    //returns the number of colums
    public int collums() {
        if (getKey()>0)
        {
            return key;
        }
        else
        {
            return Math.abs(key);
        }
    }

    //calculates how many rows are needed depending on the given key
    public int rows(String cipherText)
    {
        return  (int)Math.ceil((double)cipherText.length()/collums());
    }




    //Makes grid for encoding and fills it with the input text
    // and puts x in the end if needed
    private char[][] makeGrid(String  cipherText ){

        char[][] grid = new char[rows(cipherText)][collums()];
        int index = 0;
        for(int i=0; i <rows(cipherText) ; i++){
            for(int j=0; j < collums(); j++){
                if(index < cipherText.length())
                    grid[i][j] = cipherText.charAt(index);
                else
                    grid[i][j] = 'X';
                index++;
            }
        }

        return grid;
    }


    // function to print the required traversal
    //Prints a matrix from top left corner in counter clockwise spiral way
    static void rotateCounter(int rowEnd, int colEnd, char arr[][])
    {

        int i, rowStart = 0, colStart = 0;


        // initialize the count
        int cnt = 0;

        // total number of
        // elements in matrix
        int total = rowEnd * colEnd;
            while (rowStart < rowEnd && colStart < colEnd)
                {
                    if (cnt == total)
                        break;

                    // Print the first column
                    // from the remaining columns
                    for (i = rowStart; i < rowEnd; ++i)
                    {
                        System.out.print(arr[i][colStart] + " ");

                        cnt++;
                    }
                    colStart++;

                    if (cnt == total)
                        break;

                    // Print the last row from
                    // the remaining rows
                    for (i = colStart; i < colEnd; ++i)
                    {
                        System.out.print(arr[rowEnd - 1][i] + " ");

                        cnt++;
                    }
                    rowEnd--;

                    if (cnt == total)
                        break;

                    // Print the last column
                    // from the remaining columns
                    if (rowStart < rowEnd)
                    {
                        for (i = rowEnd - 1; i >= rowStart; --i)
                        {
                            System.out.print(arr[i][colEnd - 1] + " ");

                            cnt++;
                        }
                        colEnd--;
                    }

                    if (cnt == total)
                        break;

                    // Print the first row
                    // from the remaining rows
                    if (colStart < colEnd)
                    {
                        for (i = colEnd - 1; i >= colStart; --i)
                        {
                            System.out.print(arr[rowStart][i] + " ");

                            cnt++;
                        }
                        rowStart++;
                    }
                }


    }



    public String encrypt(String plainText){
        char[][] grid = makeGrid(plainText);
       StringBuilder sb = new StringBuilder();

        if(getKey()>0){
            //if key is >0 it prints the matrix in counterclockwise spiral
            rotateCounter(rows(plainText),collums(),grid);
            System.out.println("");
        }else if (getKey()<0){
            //if the key is <0
            //first I rotate the matrix 180 degrees
            //and then  print the matrix in counterclockwise spiral
            char[][] result = rotateMatrixRight(grid);
            char[][]finalresult=rotateMatrixRight(result);
            rotateCounter(rows(plainText),collums(),finalresult);
            System.out.println("");
        }

        return sb.toString();
    }


    public String decrypt(String ciphertext){

        StringBuilder sb = new StringBuilder();
        char arr[][] = new char[100][100];
        if(getKey()>0){
            //when the key is >0 fill a matrix in clockwise spiral than print by colums
           spiralFill(collums(), rows(ciphertext), arr,ciphertext);
           //print matrix by colums
           for (int i = 0; i < rows(ciphertext); i++) {
               for (int j = 0; j <collums() ; j++) {
                   System.out.print(arr[j][i] + " ");
               }
           }
       }else {
            //when the key is <0 fill a matrix in clockwise spiral
            //than print by colums starting from bottom left corner
            spiralFill(collums(), rows(ciphertext), arr,ciphertext);
           for (int i = rows(ciphertext)-1; i >=0; i--) {
               for (int j = collums()-1; j >=0 ; j--) {
                   System.out.print(arr[j][i]);
               }
           }

       }

        return sb.toString();
    }


    //Fills a matrix spiral form. Used to decrypt
    static void spiralFill(int rowEnd, int colEnd, char a[][],String cipherText ) {

        char [] cipherTextChars = cipherText.toCharArray();

        int val = 0;

        int rowStart = 0, colStart = 0;
        while (rowStart< rowEnd && colStart < colEnd) {
            /* Print the first row from the remaining
          rows */
            for (int i = colStart; i < colEnd; ++i) {
                a[rowStart][i] = cipherTextChars[val++];
            }

            rowStart++;

            /* Print the last column from the remaining
          columns */
            for (int i = rowStart; i < rowEnd; ++i) {
                a[i][colEnd - 1] = cipherTextChars[val++];
            }
            colEnd--;

            /* Print the last row from the remaining
           rows */
            if (rowStart < rowEnd) {
                for (int i = colEnd - 1; i >= colStart; --i) {
                    a[rowEnd - 1][i] = cipherTextChars[val++];
                }
                rowEnd--;
            }

            /* Print the first column from the remaining
           columns */
            if (colStart < colEnd) {
                for (int i = rowEnd - 1; i >= rowStart; --i) {
                    a[i][colStart] = cipherTextChars[val++];
                }
                colStart++;
            }
        }

    }


    //Rotates a matrix right
    public static char[][] rotateMatrixRight(char[][] matrix) {
        int w = matrix.length;
        int h = matrix[0].length;
        // w and h swapped
        char[][] result = new char[h][w];
        for (int i = 0; i < h; ++i) {
            for (int j = 0; j < w; ++j) {
                result[i][j] = matrix[w - j - 1][i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Type encrypt if you want to encrypt");
        System.out.println("Type decrypt if you want to decrypt");
        Scanner scanner = new Scanner(System.in);
        String method = scanner.nextLine();

        if(method.equals("encrypt")){
            System.out.println("Type the text you want to encrypt and than the key");

            String plainText = scanner.nextLine();
            Integer key=scanner.nextInt();

            RouteCipher cipher = new RouteCipher(key);
            plainText = plainText.chars().mapToObj(c -> (char) c).map(Character::toUpperCase).filter(x -> 'A' <= x &&  x <= 'Z').map(String::valueOf).collect(Collectors.joining());
            cipher.encrypt(plainText);


        }else if(method.equals("decrypt")){
            System.out.println("Type the text you want to decrypt and than the key");

            String cipherText = scanner.nextLine();
            Integer key=scanner.nextInt();
            RouteCipher cipher1 = new RouteCipher(key);
            cipher1.decrypt(cipherText);

        }else System.out.println("Invalid command");



        //String  cipherText = "WEAREDISCOVEREDFLEEATONCE";
       // String cipherText ="ABORTTHEMISSIONYOUHAVEBEENSPOTTED";
        //String control = "CEXXECNOTAEOWEAREDISLFDEREV";
        //String control = "WOEATONCEXXECSIDERAEVEREDFL";
        //String cipherText="xteanitrobatsyvntedxoehomehsoespbui";
        //String cipherText = "ATSYVNTEDXXTEANITROBHSOESPOEHOMEIUB";
        //String cipherText ="XECSIDERAEWOEATONCEXLFDEREV";
        // String control="xteanitrobatsyvntedxoehomehsoespbui";
         //String cipherText = "abort the mission, you have been spotted";
        //String cipherText = "ABORTTHEMISSIONYOUHAVEBEENSPOTTED";
        //String message ="why is this professor so boring omg";







    }
}

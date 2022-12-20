package Arrays.PracticeSet;
import java.util.Scanner;

public class ques4 {
    public static void main(String[] args) {
        //QUESTION4
//Create a Java program to add two matrices of size 2*3.

        int M1[][]= {{1,2,3},
                {4,5,6}};
        int M2[][]= {{2,4,6},
                {8,10,10}};
        int result[][]= {{0,0,0},
                {0,0,0}};

        for(int i=0;i<M1.length;i++)   {              // row no. of times
            for (int j = 0; j<M1[i].length;j++)      {  // column no.of times
                result[i][j] = M1[i][j] + M2[i][j];
            }
        }
        for(int i=0;i<M1.length;i++) {              // row no. of times
            for (int j = 0; j < M1[i].length; j++) {  // coloumn no.of times
                System.out.print(result[i][j]);
                System.out.print(" ");
                result[i][j] = M1[i][j] + M2[i][j];


            }
            System.out.print("\n");
        }





    }
    }


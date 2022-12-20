package Arrays;
import java.util.Scanner;

public class arrays2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1st way to declare an array
        int[] arr; //--> declaration
        arr = new int[5]; //--> memory allocation

        //2nd way to declare an array
        int[] arr1 = new int[5]; //-->declaration + memory allocation

        //3rd way of declaration
        int[] arr2 = {1,2,3,4,5}; //-->declaration + memory allocation + initialization

        //to find out the length of array we have a function known as length()

        int size = arr2.length;
        // System.out.println(size);

        System.out.println(arr2.length);

        //Indexing of array goes from 0-->(arr.length-1)

        int a = 23;
        System.out.println(a);

        for (int i=0; i<=arr2.length-1; i++){
            System.out.println(arr2[i]);
        }
    }
    }


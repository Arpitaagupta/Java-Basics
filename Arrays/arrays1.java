package Arrays;
import java.util.Scanner;

public class arrays1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //An array is collection of similar types of data having contingous memory allocation.
        //Java has no concept of pointers.

        //Indexing of arrays starts from zero i.e. first element will be stored at zeroth index, second
        //element at first index, third element at second index and so on.

        //The size of an array cannot be increased at runtime, therefore we can store only a fixed size
        //of element in arrays.

        //Use case --> Storing marks of 5 students

      //  int marks[] = new int[5];      // 1st way of initializing
    //   marks[0] = 100;
     //  marks[1] = 82;
     //  marks[2] = 85;
     //  marks[3] = 78;
     //   marks[3] = 92;    -----> if i print this line this array allocation of marks[3] will get updated to 92
     //  marks[4] = 98;
      // marks[5] =100;   -> throws an error

      // System.out.println(marks[2]);



        // ways of writing array

//                2nd way


       int marks[];
        marks = new int[4];
        marks[0] = 1;
        marks[1] = 82;
        marks[2] = 85;
        marks[3] = 78;

       System.out.println(marks[3]);

        // 3rd way;

//       int [] marks= {1,2,3,4,5};
  //      System.out.println(marks[3]);












    }
}

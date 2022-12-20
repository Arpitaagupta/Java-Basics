package Arrays.PracticeSet;

public class ques2 {
    //Question2
//Write a program to find out whether a given integer present in an array or not.

        public static void main(String[] args) {
            System.out.println("Printing using for loop");
            Integer num = 11;
            boolean IsInArray = false;
            Integer arr[] = {2, 7, 9, 5, 67, 11, 23};
            for (Integer elements : arr) {
                if (num == elements) {
                    IsInArray = true;
                    break;
                }

                if(IsInArray)  {
                    System.out.println("The integer is present in the array");
                }
                else {
                    System.out.println("The value is not present in the array");
                }

            }
        }
    }


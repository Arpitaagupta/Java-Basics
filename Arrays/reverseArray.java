package Arrays;

public class reverseArray {
    public static void main(String[] args) {
        //Ques-->Write a java program to print elements of array in reverse order.

            String[] arr = {"Peanut", "Butter", "Honeyy", "Abhii", "We"};

            for (int i = arr.length - 1; i>=0 ; i--) {
                System.out.println(arr[i]);
            }
        }
    }


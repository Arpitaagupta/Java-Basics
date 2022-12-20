package Strings;
import  java.util.Scanner;

public class methodsOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Java method work on String
        //String is an array of character.
        //Indexing of strings and arrays always starts from 0.
        //eg: HONEYY length-->6; indexing-->012345

        String name = "HONEYYYYS";
        String abhii = "abhishek";
        String mom = "         Mumma, I love you to the moon and back!        ";
        String con = "Argentina";
        String prog ="Hello World";
        String aa = "ARPITAARUSHI";

        //1.length() --> returns the length of string
        System.out.println(name.length());
        System.out.println(abhii.length());

        //2.toLowerCase() --> returns a new string in which all letters will be in lower case.
        System.out.println(name.toLowerCase());

        //3.toUpperCase() --> returns a new string in which all letters will be in upper case.
        System.out.println(abhii.toLowerCase());

        //4.trim () --> Returns a new string by removing all leading and trailing spaces from the original string.
        System.out.println(mom);  //-->it will print original string
        System.out.println(mom.trim());  //--> prints trimmed string

        //5.substring(int start) --> returns a sub string from start to end.
        System.out.println(con.substring(5));

        //6.substring(int start,int end) --> returns a substring starting from start index going upto end index.
            //prints from indexing subString(n,m) --> n to m-1
                //start index is included and end index is excluded
        System.out.println(con.substring(5,7));
        System.out.println(prog.substring(5,10));

        //7.replace(char oldChar, char newChar) --> returns a new string after replacing ______ with ______
        System.out.println(abhii.replace('i','u'));

        //8.startsWith(" ") --> returns true if given string starts with entered string.
            //-->It returns a boolean value
        System.out.println(abhii.startsWith("A")); //false-->case sensitive
        System.out.println(abhii.startsWith("a"));  //true
        System.out.println(name.startsWith("V"));

        //9.endsWith(" ") --> returns true if given string ends with entered string.
                  //-->It returns a boolean value
        System.out.println(name.endsWith("Y"));
        System.out.println(name.endsWith("y")); //returns false --> cuz its case sensitive
        System.out.println(abhii.endsWith("ek"));

        //10.charAt() --> Returns character at given index position
        System.out.println(abhii.charAt(0));
        System.out.println(name.charAt(4));

        //11.indexOf(" ") --> returns a index at given string
            //-->returns a integer value
        System.out.println(abhii.indexOf("h"));
        System.out.println(name.indexOf("Y"));
            //-->it returns the first occurrence of string character.

        //12.lastIndexOf( ) --> returns the last index of given string
            //-->it returns the last occurrence of string character.
        System.out.println(name.lastIndexOf("Y"));

        //13.indexOf(String str, int fromIndex) -->Returns the index of the given string starting from given index.
        System.out.println(con.indexOf("n",4));
        System.out.println(aa.indexOf("A",5));

        //14. lastIndexOf()
        System.out.println(abhii.lastIndexOf("e"));
         System.out.println(abhii.lastIndexOf("shek", 11 ));

         //15.equals() --> returns true if the given string is same as entered string
                //-->It returns a boolean value.
                //-->Case sensitive
        System.out.println(abhii.equals("Abhishek"));
        System.out.println(con.equals("Argentina"));

        //16.equalsIgnoreCase() --> returns true if the given string is same as entered string, ignoring the case of character.
        System.out.println(con.equalsIgnoreCase("ARGENTINA"));
        System.out.println(con.equals("Argentina"));


    }
}

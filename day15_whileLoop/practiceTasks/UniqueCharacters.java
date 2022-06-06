package day15_whileLoop.practiceTasks;

public class UniqueCharacters { // Task 9

    public static void main(String[] args) {


        /*
          So the indexOf will return first occurrence of the value and the lastIndexOf will return the last occurence of the value.

        Example (copied from MDN):

        var anyString = "Brave new world";
        var a = anyString.indexOf("w")); // result = 8
        var b = anyString.lastIndexOf("w")); // result 10

         */

        String str = "AABCCD";

        String result = "";

        for (int i = 0; i < str.length() ; i++) {

            if(str.indexOf(""+str.charAt(i))  == str.lastIndexOf("" + str.charAt(i))  ){
                result += str.charAt(i);
            }

        }


        System.out.println(result);

    }

}



/*
9. Create a class called UniqueCharacters, Write a program that can return the unique characters from a String

	            Ex:
	                input:
	                    AABCCD

	                output:
	                    BD

	            Hint: You will need indexOf() and lastIndexOf()
	                  if the first and last index numbers of the character are same, then it's unique
 */



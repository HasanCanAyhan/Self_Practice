package PracticeTasks_Muhtar_Solutions.day15_whileLoop;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str = "AABCCD";

        String unique = "";

        for (int i = 0; i < str.length() ; i++) {

            char ch = str.charAt(i);

            if(str.indexOf(ch) == str.lastIndexOf(ch)){
                unique += ch;
            }

        }

        System.out.println("unique = " + unique);

    }

}
/*
Create a class called UniqueCharacters, Write a program that can return the unique characters from a String
	            Ex:
	                input:
	                    AABCCD
	                output:
	                    BD
	            Hint: You will need indexOf() and lastIndexOf()
	                  if the first and last index numbers of the character are same, then it's unique
 */
package PracticeTasks_Muhtar_Solutions.day14_forLoop;

public class Palindrome {

    public static void main(String[] args) {

        String str = "level";

        String result = "";

        for (int i = str.length() -1; i >= 0 ; i--) {

            result += str.charAt(i);

        }

        boolean isPalindrome = str.equals(result);
        System.out.println(isPalindrome);



    }

}
/*
Write a program that can check if the given String is palindrome
			Ex:
				input:
					Level
				output:
					true
				input:
					Anna
				output:
					true
 */
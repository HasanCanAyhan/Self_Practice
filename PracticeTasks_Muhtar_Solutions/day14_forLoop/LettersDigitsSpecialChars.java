package PracticeTasks_Muhtar_Solutions.day14_forLoop;

public class LettersDigitsSpecialChars {

    public static void main(String[] args) {

        String digits = "";
        String letters = "";
        String special_chars= "";

        String str = "ABCD123#$@!";

        for (int i = 0; i < str.length() ; i++) {

            char each = str.charAt(i);

            if(each >= 'a' && each <='z'|| each >= 'A' && each <='Z'){
                letters += ""+each;
            }else if(each >= '0' && each <= '9'){
                digits += each;
            }else {
                special_chars += each;
            }

        }

        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("special_chars = " + special_chars);

    }

}
/*
write a program that can retive the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!
                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!
 */
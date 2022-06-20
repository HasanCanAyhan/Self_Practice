package day22_arrayList.practiceTasks;

public class RetrieveLettersDigitsOrSpecialCh { // Task 5

    public static void main(String[] args) {


        String str = "Wooden Spoon!";

        String letters = "" ;
        String digits = "";
        String specialChars = "";

       char[] eachCh =  str.toCharArray();

        for (char each : eachCh) {

            if (Character.isLetter(each)){
                letters += each;
            } else if (Character.isDigit(each)) {
                digits += each;
            } else if (!Character.isLetterOrDigit(each)) {
                specialChars += each;
            }

        }

        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);


    }

}
/*
5. Write a program that can retrieve the letters, digits and special characters from the string
        Ex:
            str = "Wooden Spoon!"

        output:
            letters= "WoodenSpoon";
            Digits = "";
            specialChars = " !";

        Note: Use Wrapper class methods


 */

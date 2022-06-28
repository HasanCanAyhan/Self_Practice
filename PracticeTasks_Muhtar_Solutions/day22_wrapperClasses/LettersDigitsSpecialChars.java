package PracticeTasks_Muhtar_Solutions.day22_wrapperClasses;

public class LettersDigitsSpecialChars {

    public static void main(String[] args) {


        String str = "Wooden 123 Spoon!";

        String letters = "";
        String digits = "";
        String specialChars = "";

        for (char eachChar : str.toCharArray()) {

            if (Character.isDigit(eachChar)){
                digits += eachChar;
            }else if(Character.isLetter(eachChar)){
                letters += eachChar;
            }else if(!Character.isLetterOrDigit(eachChar)){
                specialChars += eachChar;
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

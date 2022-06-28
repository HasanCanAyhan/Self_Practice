package PracticeTasks_Muhtar_Solutions.day22_wrapperClasses;

public class UpperCaseAndLowerCase {

    public static void main(String[] args) {


        String  str = "JAVA java";

        int countUpper = 0;
        int countLower = 0;
        for (int i = 0; i < str.length() ; i++) {

            char ch = str.charAt(i);

            if(Character.isUpperCase(ch)){
                countUpper++;
            } else if (Character.isLowerCase(ch)) {
                countLower++;
            }

        }


        /*
            for (char each : str.toCharArray()) {
            if(Character.isUpperCase(each)){
                upperCase++;
            }else if(Character.isLowerCase(each)){
                lowerCase++;
            }else{
                continue;
            }
        }
         */

        boolean isEqual = countLower == countUpper;
        System.out.println(isEqual);


    }



}
/*
6. Write program that returns true if the total number of upper case characters are equal to total number of Lowercase characters of a string
        Ex:
            str = "JAVA java";
        output:
            true
        Note: Use Wrapper class methods
 */
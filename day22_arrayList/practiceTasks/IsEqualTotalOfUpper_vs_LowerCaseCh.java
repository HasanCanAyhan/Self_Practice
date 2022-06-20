package day22_arrayList.practiceTasks;

public class IsEqualTotalOfUpper_vs_LowerCaseCh { // Task 6

    public static void main(String[] args) {

        String str = "JAVA java";

        char[] eachCh = str.toCharArray();

        int count_upperCase = 0;
        int count_lowerCase = 0;

        for (char eachElement : eachCh) {

            if (Character.isUpperCase(eachElement)){
                count_upperCase++;
            }

            if (Character.isLowerCase(eachElement)){
                count_lowerCase++;
            }


        }


        boolean isEqual = count_upperCase == count_lowerCase;
        System.out.println("isEqual = " + isEqual);


    }


}
/*
6.Write program that returns true if the total number of upper case characters are equal to total number of Lowercase characters of a string
        Ex:
            str = "JAVA java";

        output:
            true

        Note: Use Wrapper class methods
 */
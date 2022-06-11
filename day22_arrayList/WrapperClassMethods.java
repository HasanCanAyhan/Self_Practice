package day22_arrayList;

public class WrapperClassMethods {

    public static void main(String[] args) {

        // parse method: returns primitive type, converts String to primitive values
        // valueOf method: returns wrapper class objects, converts String to wrapper class values


        String str = "20";

        int num1 = Integer.parseInt(str);

        // Integer num2 = Integer.parseInt(str);

        int num = Integer.parseInt(str); // neither auto boxing nor unboxing
        // int primitive = int  primitive

        System.out.println(num + 1); // 21

        //----------------------------

        Integer num2 = Integer.valueOf(str); // 20

        System.out.println("------------------------------------------");

        String s = "20.5";

        double num3 = Double.parseDouble(s);

        Double num4 = Double.valueOf(s);

        System.out.println(num3); // 20.5
        System.out.println(num4); // 20.5

        System.out.println("------------------------------------------");

        String x = "true";

        boolean r1 = Boolean.parseBoolean(x);

        Boolean r2 = Boolean.valueOf(x);

        System.out.println(r1); // true
        System.out.println(r2); // true


        System.out.println("----------------------------------------------------------");

        // Character Class

        char ch = '1';

        boolean isDigit = Character.isDigit(ch);

        System.out.println("isDigit = " + isDigit); // true


        char ch1 = 'A';

        boolean isLetter = Character.isLetter(ch1);
        System.out.println("isLetter = " + isLetter); // true

        boolean isLowerCase = Character.isLowerCase(ch1);
        System.out.println("isLowerCase = " + isLowerCase); // false

        boolean isUpperCase = Character.isUpperCase(ch1);
        System.out.println("isUpperCase = " + isUpperCase); // true

        // Special Character : ! @ # $

        char ch2 = '$';

        boolean isSpecialChar = !Character.isLetterOrDigit(ch2); //**** special ch : !Character.isLetterOrDigit
        System.out.println("isSpecialChar = " + isSpecialChar); // true


        System.out.println("-----------------------------------------------");

        //  sum of digit

        String string = "a1b2c3d4e5";

        int sum = 0;

        //First; string.toCharArray().for in order to get each char in the given string

        for (char each : string.toCharArray()) { // in order to get each char in the given string

            if (Character.isDigit(each)){ // check if it is digit or not
               sum += Integer.parseInt("" +each); // if so, with parsel method ,it is converted from the String to int number
            }

        }

        System.out.println("sum = " + sum); // 15


    }

}

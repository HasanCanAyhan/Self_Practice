package day14_forLoop;

import java.util.Scanner;

public class Finra {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("enter a num : ");
        int num = input.nextInt();

        input.close();

        System.out.println( convertFromNumToString(num) );





    }


    public static String convertFromNumToString(int num){

        String result ="";

        for (int i = 1; i <= num ; i++) {

            if(i %15 == 0){
                result += " FINRA ";
            }else if(i %3 == 0 && i %5 != 0 ){
                result += " FIN ";
            }else if(i %5 == 0){
                result += " RA ";
            }else{
                result += i + " ";
            }

        }


        return result;
    }

}
/*
2. Write a method which prints out the numbers from 1 to 100 butfor numbers
 which are a multiple of both 3 and 5, print "FINRA" instead of the number,
 for numbers which are a multiple of 3, print "FIN" instead of the number
 and for numbers which are a multiple of 5, print "RA" instead of the number.

    ex:
        output:
            1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA 16 17 FIN
 */

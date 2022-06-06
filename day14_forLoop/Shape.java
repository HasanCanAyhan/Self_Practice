package day14_forLoop;

public class Shape {

    public static void main(String[] args) {

        String result="";

        for (int i = 1; i <= 8; i++){ // row

            for (int j = 1; j <= 6; j++){ // column

                result += "* ";
            }

            result += "\n";
        }
        System.out.println(result);





    }




}
/*
1. Use a loop to print the following shape:

                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
 */
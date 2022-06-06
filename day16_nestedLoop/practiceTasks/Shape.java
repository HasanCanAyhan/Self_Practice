package day16_nestedLoop.practiceTasks;

public class Shape { // Task 1

    public static void main(String[] args) {


        for (int i = 0; i < 10 ; i++) {

            System.out.println();

            for (int j = 0; j < 10 ; j++) {

                if( i >= j ) {
                    System.out.print("* ");
                }
            }

        }




    }

}
/*
1. Use a nested loop to print the following shape

        *
        * *
        * * *
        * * * *
        * * * * *
        * * * * * *
        * * * * * * *
        * * * * * * * *
        * * * * * * * * *
        * * * * * * * * * *
 */
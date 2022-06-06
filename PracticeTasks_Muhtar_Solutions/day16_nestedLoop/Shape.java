package PracticeTasks_Muhtar_Solutions.day16_nestedLoop;

public class Shape {

    public static void main(String[] args) {

        for (int i = 1; i <= 10 ; i++) {

            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }

            System.out.println();
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

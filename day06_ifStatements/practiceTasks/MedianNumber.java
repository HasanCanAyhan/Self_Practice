package day06_ifStatements.practiceTasks;

public class MedianNumber {

    public static void main(String[] args) {

        int a = 22, b = 55, c = 20;

        boolean isMiddleA = (a > b && a < c) || (a > c && a < b);
        boolean isMiddleB = (b > a && b < c) || (b > c && b < a );
        boolean isMiddleC = (c > a && c < b) || (c > b && c < a);

        if (isMiddleA){
            System.out.println(a + " is the median number");
        }
        if (isMiddleB){
            System.out.println(b + " is the median number");
        }
        if (isMiddleC){
            System.out.println(c + " is the median number");
        }




    }

}
/*
1. Create a class named MedianNumber. write a program that can find the median number between three DIFFERENT given integers

		Ex:
                a = 10, b= 15, c = 20;

            Output:
                15 is the median number

 */
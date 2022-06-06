package day13_customMethods;

public class SumOfNumbers {
    public static void main(String[] args) {


        System.out.println(sumOf2Numbers(1,2));

        System.out.println("--------------------------");

        System.out.println(sumOf3Numbers(1,2,3));

        System.out.println("--------------------------");

        System.out.println(sumOf4Numbers(1,2,3,4));

    }

    public static int sumOf2Numbers(int n1 , int n2){

        int sum = n1 + n2;
        return sum;

    }

    public static int sumOf3Numbers(int n1 , int n2, int n3){

        int sum1 = sumOf2Numbers(n1,n2) + n3;
        return sum1;
    }

    public static int sumOf4Numbers(int n1 , int n2, int n3 , int n4){
        int sum2 = sumOf3Numbers(n1,n2,n3) + n4;
        return sum2;

    }



}

/*
Task 2:
    1. create a method that can find the sum of two integer numbers
                method name: sumOf2Numbers

    2. create a method that can find the sum of three integer numbers
                method name: sumOf3Numbers

    3. create a method that can find the sum of four integer numbers
                method name: sumOf4Numbers

 */

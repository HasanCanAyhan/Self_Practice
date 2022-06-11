package day20_forEach.practiceTasks;

public class EvenOddNumberFromArray { // Task 2

    public static void main(String[] args) {


        int[] arr2 ={4,5,6,7,8};

        int count_even = 0;
        int count_odd = 0;
        for (int each : arr2) {

            if(each % 2 == 0){
                count_even++;
            }

            if (each %2 == 1){
                count_odd++;
            }


        }

        System.out.println("count_even = " + count_even);
        System.out.println("count_odd = " + count_odd);


    }

}
/*
2.  Write a program that can count the even and odd number from an array of integers

			Note: MUST use for each loop
 */

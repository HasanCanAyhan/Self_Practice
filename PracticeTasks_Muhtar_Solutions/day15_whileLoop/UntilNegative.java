package PracticeTasks_Muhtar_Solutions.day15_whileLoop;

import java.util.Scanner;

public class UntilNegative {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int sum = 0;

        while(true){

            System.out.println("enter a number:");
            int num = input.nextInt();

            if(num < 0){
                break;
            }

            sum += num;
        }

        System.out.println(sum);

        input.close();


    }

}

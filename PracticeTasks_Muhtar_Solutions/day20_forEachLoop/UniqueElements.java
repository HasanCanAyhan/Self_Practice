package PracticeTasks_Muhtar_Solutions.day20_forEachLoop;

public class UniqueElements {

    public static void main(String[] args) {


        int[] array = {1, 1, 2, 3, 3, 3, 4, 5, 5, 5, 5};


        for (int each : array) {

            int count = 0;

            for (int eachElement : array) {

                if(each == eachElement){
                    count++;
                }

            }

            if (count == 1){
                System.out.println(each);
            }


        }


    }

}
/*
Write a program that can display the unique elements of an array
 */
package day20_forEach.practiceTasks;

public class UniqueElementsOfArray { // Task 5

    public static void main(String[] args) {


        String[] arr = {"a","a","b","b","b","c","d"};

        String result = "";


        for (String each : arr) {

            int count = 0;

            for (String str : arr) {

                if(each.equals(str)){
                    count++;

                }


            }

            if(count == 1){
                result += each;

            }


        }

        System.out.println("result = " + result);




    }

}
/*

5. Write a program that can display the unique elements of an array

			MUST use for each loops

 */
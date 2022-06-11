package day20_forEach.lessonQS;

public class ForEachLoop {

    public static void main(String[] args) {

        int[] numbers = {10,20,30,40,50};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("------------------------------------------");

         /*
        Syntax:

        for(dataType variableName : dataStructure){
            // Statement
        }
         */

        for(  int each   : numbers  ){
            System.out.println(each); // 5  times and it gives me every single element from the given array
        }



    }

}

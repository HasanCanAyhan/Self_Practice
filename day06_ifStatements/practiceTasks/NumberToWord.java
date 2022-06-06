package day06_ifStatements.practiceTasks;

public class NumberToWord {

    public static void main(String[] args) {

        int number = 3;

        String word = "";

        if(number == 0){
            word = "zero";
        }
        if(number == 1){
            word = "one";
        }
        if(number == 2){
            word = "two";
        }
        if(number == 3){
            word = "three";
        }
        if(number == 4){
            word = "four";
        }
        if(number == 5){
            word = "five";
        }
        if(number == 6){
            word = "six";
        }
        if(number == 7){
            word = "seven";
        }
        if(number == 8){
            word = "eight";
        }
        if(number == 9){
            word = "nine";
        }
        System.out.println("word = " + word);



    }

}
/*
2. Create a  class named NumberToWord, and write a java program that can convert numbers between 0 ~ 9 to words
			Ex:
				number = 1;

			output:
				One

		Note: Do not use more than one print statement
 */

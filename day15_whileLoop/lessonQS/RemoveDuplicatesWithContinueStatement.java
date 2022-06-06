package day15_whileLoop.lessonQS;

public class RemoveDuplicatesWithContinueStatement {

    public static void main(String[] args) {

        String str = "aaaabbbbbcccccc";

        String container = "";

        for (int i = 0; i < str.length() ; i++) {

            char eachCharacter = str.charAt(i);

            if(  container.contains(""+eachCharacter)  ){
                continue;
            }

            container += eachCharacter;


        }

        System.out.println(container);




    }

}
/*
3. Write a program that can remove the duplicated characters from a string
				Ex:
					str = "aabbbcccc"
					output:
						abc
 */

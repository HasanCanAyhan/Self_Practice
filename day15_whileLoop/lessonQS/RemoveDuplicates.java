package day15_whileLoop.lessonQS;

public class RemoveDuplicates {

    public static void main(String[] args) {


        String str = "aabbbcccc";

        String result = ""; // another container to collect "a b c "


        for (int i = 0; i < str.length() ; i++) {

            char each_character = str.charAt(i);

            if(  ! (result.contains(""+ each_character )    )  ){

                result += each_character;

            }

        }

        System.out.println(result);




    }




}
/*
3. Write a program that can remove the duplicated characters from a string
				Ex:
					str = "aabbbcccc"
					output:
						abc
 */

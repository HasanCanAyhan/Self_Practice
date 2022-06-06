package day15_whileLoop.practiceTasks;

public class CatAndDog1 {

    public static void main(String[] args) {

        // other solution

        String str1 = "caT dog dogG cAt";


        int count_for_cat = 0;
        int count_for_dog = 0;

        for (int i = 0; i < str1.length() ; i++) {

            if(i > str1.length() - 3 ){
                break;
            }else{

                if(  (str1.substring(i,i+3)).equalsIgnoreCase("cat")){
                   count_for_cat ++;
                }else if (  (str1.substring(i,i+3)).equalsIgnoreCase("dog")  ){
                    count_for_dog++;
                }

            }

        }


        System.out.println(count_for_cat == count_for_dog);


    }

}
/*

2. write a program to print true if the string "cat" and "dog" appear the same number of times in the given sentence

            Ex:
                sentence = "caT dog dogG cAt"

                output:
                    true


 */

package day15_whileLoop.practiceTasks;

public class CatAndDog { // Bonuses - 2

    public static void main(String[] args) {


            String str = "caT dog dogG cAt cat dog";

            str = str.toLowerCase();


            int i = 0;
            while(str.contains("cat")){

                str = str.replaceFirst("cat","app");

                i++;
            }



        int j = 0;
        while(str.contains("dog")){

            str = str.replaceFirst("dog","app");

            j++;
        }



        boolean cat_vs_dog = i == j;

        System.out.println(cat_vs_dog);




    }


}
/*

2. write a program to print true if the string "cat" and "dog" appear the same number of times in the given sentence

            Ex:
                sentence = "caT dog dogG cAt"

                output:
                    true

 */

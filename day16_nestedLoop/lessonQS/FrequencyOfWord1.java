package day16_nestedLoop.lessonQS;

public class FrequencyOfWord1 {

    public static void main(String[] args) {

        // Another Solution with for-loop

        String str1 = "java JAVA jAvA JAva";
        String word = "java";


        int count = 0;

        for (int i = 0; i < str1.length() ; i++) {

            if (i > str1.length() -4 ){
                break;
            }else{

                if( str1.substring(i,i+4).equalsIgnoreCase(word)    ){
                    count ++;
                }


            }

        }

        System.out.println(count);



    }


}

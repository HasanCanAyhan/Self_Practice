package day16_nestedLoop.lessonQS;

public class FrequencyOfAChar1 {

    public static void main(String[] args) {

        // Another solution with for-loop

        String str = "aaabbbbccccc";
        char ch = 'c';

        int count = 0;

        for (int i = 0; i < str.length() ; i++) {

            if( str.substring(i,i+1).contains(""+ch)  ){
                count ++;
            }

        }

        System.out.println(count);


    }

}

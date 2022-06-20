package day24_dateAndTime.lessonQS;

import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfCharacters {

    public static void main(String[] args) {


        String str = "aaabbbbccccc";

        //a3b4c5

        String result = "";


        String[] strArr = str.split("");

        for (String each : strArr) { // with frequency method we don´t need to use nested loop

            int frequency = Collections.frequency(Arrays.asList(strArr),each);
            //               it is converted to CollectionTypes because it is String[] array
            if(!result.contains(each)){
                result += each + frequency;
            }

        }

        System.out.println("result = " + result); //a3b4c5



    }

}

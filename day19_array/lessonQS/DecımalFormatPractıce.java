package day19_array.lessonQS;

import java.text.DecimalFormat;

public class DecımalFormatPractıce {

    public static void main(String[] args) {


        DecimalFormat df = new DecimalFormat("0.00");

        double average = 30.1284555;

        System.out.println("average = " + df.format(average)); // average = 30,13


    }

}

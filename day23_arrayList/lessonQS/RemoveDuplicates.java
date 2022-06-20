package day23_arrayList.lessonQS;

import java.util.ArrayList;

public class RemoveDuplicates {

    public static void main(String[] args) {


        ArrayList<String> names = new ArrayList<>();

        names.add("Vasyl"); // 0
        names.add("Vasyl"); // 1
        names.add("Sumeye");
        names.add("Sumeye");
        names.add("Ali");
        names.add("Sumeye");

        System.out.println(names); // [Vasyl, Vasyl, Sumeye, Sumeye, Ali, Sumeye] - orginal


        ArrayList<String> nonDup = new ArrayList<>(); // new ArrayList

        for (String each : names) {

              /*
              if (nonDup.contains(each)){
                continue;
            }
             */

            if(!nonDup.contains(each)){ // to get each Element
                nonDup.add(each);
            }


        }

        //[Vasyl, Sumeye, Ali]

        names = nonDup; // we want to make orginel list (names) will be unreferanceses and eligible for garbage collection, we don´t need to have.
        // refVar
        // I have no longer this orginal object(names)

        System.out.println(names);




    }


}

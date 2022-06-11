package day21_multiDimentionalArray.lessonQS;

import java.util.Arrays;

public class MultiDimensionalArrayPractice {

    public static void main(String[] args) {

        String[] group1 = {"James", "Daniel", "Can", "Boban"}; // 4 names
        String[] group2 = {"Mad", "Dieb", "Can"}; // 3 names
        String[] group3 = {"Can", "Ay", "Nisa", "Aydur", "Yilmaz"}; // 5 names
        String[] group4 = {"Akman", "Bahadir"}; // 2 names

        String[][] groups = {  group1 , group2 , group3 , group4        };

        for (int i = 0; i < groups.length; i++) {

            String[] eachGroup = groups[i];
            System.out.println(Arrays.toString(eachGroup));   // groups[i]

            for (int j = 0; j < groups[i].length; j++) {

                String eachStudent = eachGroup[j];
                System.out.println(eachStudent);   // groups[i][j]
            }


        }


        System.out.println("--------------------------------------------------------");


        // for each loop

        for (String[] eachGroup : groups) {
            System.out.println(Arrays.toString(eachGroup));

            for (String eachStudent : eachGroup) {
                System.out.println(eachStudent);
            }
            
        }


        System.out.println("--------------------------------------------------------");

        // Reversed order

        for (int i = groups.length - 1; i >= 0; i--) {

            String[] eachGroup_reversed = groups[i];
            System.out.println(Arrays.toString(eachGroup_reversed) ); // first group 4 - gr 3 - gr2 -gr1

            for (String eachStudent : eachGroup_reversed) {
                System.out.println(eachStudent); // normal order : group 4´s first Akman and second Bahadir
            }


        }

        System.out.println("-------------------------------------------");

        System.out.println(groups); // hashcode

        System.out.println(Arrays.toString(groups)); // toString() ==>> for single dimensional arrays ONLY

        System.out.println(Arrays.deepToString(groups));  // deepToString() ==> for multi-dimensional dimensional arrays ONLY






    }


}

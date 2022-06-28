package PracticeTasks_Muhtar_Solutions.day19_array;

import java.util.Arrays;

public class ClassMates_Reverse {

    public static void main(String[] args) {


        String[] classmates = {"Cydeo School", "Wooden Spoon", "Java Programming", "SQL Programming", "Spring Boot",
                "API", "Database", "Data Structures"};

        for (String eachName : classmates) { // for eachElement such as :  Cydeo School

            String reverse = "";

            for (int i = eachName.length()-1; i >= 0 ; i--) { // for each Character as reversed such as loohcS oedyC

                reverse += eachName.charAt(i);

            }


            System.out.println(reverse);

        }


    }

}
/*
create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}
        		output:
        			avaJ
        			nohtyp
        			#c
 */
package PracticeTasks_Muhtar_Solutions.day19_array;

public class ClassMates_Initials {

    public static void main(String[] args) {

        String[] names = {"Can Ayhan","Aras Emir ","Emir Aras","Boban Milisovic","Ermek By","Adili Kurshad","Asell Huseyn","Dilber By"};

        for (String each : names) {

            System.out.println(each.charAt(0) + "." + each.charAt(  each.indexOf(" ") +1   )   );

        }


    }

}
/*
create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines
 */
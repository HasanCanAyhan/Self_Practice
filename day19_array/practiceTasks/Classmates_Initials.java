package day19_array.practiceTasks;

public class Classmates_Initials { // Task 1

    public static void main(String[] args) {


       String[] classmates = {"Can A","Boban B","Ermek E","Evgenia E","Aseel A","Adil A","Marco M","Beyza B","Ower O","Ömer Ö"};

       //initials : C.A, B.B

        for (int i = 0; i < classmates.length; i++) {

            char firstCh = classmates[i].charAt(0);

            int index_space= classmates[i].indexOf(" ");

            char secondCh = classmates[i].charAt(index_space +1);

            System.out.println(firstCh+" " + secondCh);
        }




    }

}
/*
1. create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines
 */
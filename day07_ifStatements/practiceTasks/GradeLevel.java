package day07_ifStatements.practiceTasks;

public class GradeLevel {

    public static void main(String[] args) {

        byte gradeLevel = 20;

        String school = "";

        if (gradeLevel > 0 && gradeLevel <= 18) {

            if (gradeLevel <= 5){
                school = "Elementary School";
            } else if (gradeLevel > 5 && gradeLevel <= 8 ) {
                school = "Middle School";
            }else if (gradeLevel > 8 && gradeLevel <= 12 ) {
                school = "High School";
            }else if (gradeLevel > 12  && gradeLevel <= 16 ) {
                school = "Collage";
            }else{
                school = "Grad School";

            }


        }else{
            school = "INVALID !";
        }

        System.out.println(school);


    }
}

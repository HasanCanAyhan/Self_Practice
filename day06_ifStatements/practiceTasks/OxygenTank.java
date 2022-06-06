package day06_ifStatements.practiceTasks;

public class OxygenTank {

    public static void main(String[] args) {

        int oxygenLevel = 80;

        String message = "";

        if (oxygenLevel >= 90) {
            message = "Your tank is full";
        }
        if (oxygenLevel >= 80 && oxygenLevel < 90) {
            message = "Still okay";
        }
        if (oxygenLevel >= 70 && oxygenLevel < 80) {
            message = "Don't go too far";
        }
        if (oxygenLevel >= 60 && oxygenLevel < 70) {
            message = "Start to head back";
        }
        if (oxygenLevel >= 50 && oxygenLevel < 60) {
            message = "Be careful now you at 50%";
        }


        System.out.println("message : " + message);

    }

}
/*
3. Create a class named OxygenTank. You are diving in the ocean. Your oxygen tank has a certain oxygenLevel (number) and you must print a message based on the oxygenLevel:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you at 50%

                USE ONE PRINT STATEMENT ONLY
 */

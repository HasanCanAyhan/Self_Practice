package day06_ifStatements.practiceTasks;

public class AgeGroups {

    public static void main(String[] args) {


        int num = 77;

        String groupsOfPerson = "";

        if (num >= 1 && num <= 2){
            groupsOfPerson = "infant";
        }
        if (num >= 3 && num <= 5){
            groupsOfPerson = "Toddler";
        }
        if (num >= 6 && num <= 9){
            groupsOfPerson = "Kid";
        }
        if (num >= 10 && num <= 12){
            groupsOfPerson = "Pre-Teen";
        }
        if (num >= 13 && num <= 17){
            groupsOfPerson = "Teenager";
        }
        if (num >= 18 && num <= 20){
            groupsOfPerson = "Young Adult";
        }
        if (num >= 21 && num <= 39){
            groupsOfPerson = "Adult";
        }
        if (num >= 40 && num <= 49){
            groupsOfPerson = "Young Middle-Aged Adult";
        }
        if (num >= 50 && num <= 54){
            groupsOfPerson = "Middle-Aged Adult";
        }
        if (num >= 55 && num <= 64){
            groupsOfPerson = "Very Young Senior Citizen";
        }
        if (num >= 65 && num <= 74){
            groupsOfPerson = "Young Senior Citizen";
        }
        if (num >= 75 && num <= 84){
            groupsOfPerson = "Senior Citizen";
        }
        if (num >= 85){
            groupsOfPerson = "Old Senior Citizen ";
        }

        System.out.println("groupsOfPerson = " + groupsOfPerson);






    }

}
/*
1. Create a class named AgeGroups, an integer variable named age is declared and given. write a program that can define the age groups of a person

	             age groups are:
	                    infant (1 - 2)
	                    Toddler (3 - 5),
	                    Kid (6 - 9),
	                    Pre-Teen (10 - 12),
	                    Teenager (13 - 17),
	                    Young Adult (18 - 20),
	                    Adult (21 - 39),
	                    Young Middle-Aged Adult (40 - 49),
	                    Middle-Aged Adult (50 - 54),
	                    Very Young Senior Citizen (55 - 64),
	                    Young Senior Citizen (65 - 74),
	                    Senior Citizen (75 - 84),
	                    Old Senior Citizen (85+)

            Note: Do not use more than one print statement
 */

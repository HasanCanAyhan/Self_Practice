package day07_ifStatements.practiceTasks;

public class CrewAndPassenger {

    public static void main(String[] args) {

        int totalNumberOfPeople = 75;
                
        int total = totalNumberOfPeople;

       String result = "";

        if (totalNumberOfPeople ==50 || totalNumberOfPeople ==75 || totalNumberOfPeople ==100 ){

            if (totalNumberOfPeople ==50){
                result = total + " total : 20 crew, 30 passengers";
            }else if(totalNumberOfPeople ==75){
                result = total + " total : 25 crew, 50 passengers";
            }else{
                result = total + " total : 30 crew, 70 passengers ";
            }


        }else{
            result = "Invalid !";
        }

        System.out.println(result);




    }
}
/*

3. Create a class called CrewAndPassenger, Given a number of people on the ship (int number), determine how many need to be crew members and how many can be passengers. Print how many of each type there should be.

            Total: 50  ====> 20 crew, 30 passengers
            Total: 75  ====> 25 crew, 50 passengers
            Total: 100 ====> 30 crew, 70 passengers
            Any other number of people on the ship is not valid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */
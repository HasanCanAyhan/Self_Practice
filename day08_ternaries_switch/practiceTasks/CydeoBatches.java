package day08_ternaries_switch.practiceTasks;

public class CydeoBatches {

    public static void main(String[] args) {


        String batchType = "US Morning"; // In Cydeo we have three batch types: US morning, US evening, EU.

        String result = "Class times are " ;

        switch (batchType){

            case "US Morning" :
                result += "10-5 EST. M, T, Th, F.";
                break;

            case "US Evening" :
                result += "7-10 EST. M, T, W, Th, S, S.";
                break;

            case "EU" :
                result += "10-5 EST. M, T, W, Th, F.";
                break;

            default:
                result = "Invalid Branch";
                break;

        }

        System.out.println(result);


        System.out.println("---------------------------------------------");

        // Solution 2 - if and Switch mixed


        String type = "US Evening";

        String result1 = "Class times are ";

        if (type =="US Morning" || type == "US Evening" || type == "EU" ){

            switch(type){

                case "US Morning" :
                    result1 += "10-5 EST. M, T, Th, F.";
                    break;

                case "US Evening" :
                    result1 += "7-10 EST. M, T, W, Th, S, S.";
                    break;

                case "EU" :
                    result1 += "10-5 EST. M, T, W, Th, F.";
                    break;


            }



        }else{
            result1 = "Invalid Branch";
        }

        System.out.println(result1);




    }
}
/*
10. Create a class named CydeoBatches. In Cydeo we have three batch types: US morning, US evening, EU.
        Depending on a batch type (String) print information about the batch.

        	If batch type is US morning ==> print "Class times are 10-5 EST. M, T, Th, F."
        	If batch type is US evening ==> print "Class times are 7-10 EST. M, T, W, Th, S, S"
        	If batch type is EU ==> print "Class times are  10-5 EST. M, T, W, Th, F."
        	If batch type is invalid, print "Invalid Btach"

        	Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed
 */
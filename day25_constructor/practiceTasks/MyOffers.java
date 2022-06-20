package day25_constructor.practiceTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers { // Task 5 continue


    public static void main(String[] args) {

        // 2.1 Create 7 objects of Offer
        Offer offer1 = new Offer("USA","Cydeo","Java Dev",85000,true,true,true,true);
        Offer offer2 = new Offer("Germany","Cydeo","Java Dev",80000,false,true,true,false);
        Offer offer3 = new Offer("Germany","Tesla","Java Dev",90000,false,true,true,false);
        Offer offer4 = new Offer("Germany","Tesla","Java Dev",95000,false,false,true,true);
        Offer offer5 = new Offer("Germany","Tesla","Java Dev",99000,false,false,true,true);
        Offer offer6 = new Offer("USA","Tesla"," Web Entwickler",100000,true,true,true,false);
        Offer offer7 = new Offer("USA","Apple","Web Entwickler",100000,true,true,true,true);

        // 2.2 Create an array of Offers named myOffers and store all 7 objects of offers

        Offer[] myOffers = {offer1,offer2,offer3,offer4,offer5,offer6,offer7};

        // 2.3 Create an ArrayList of Offer named fullTimeOffers and add all the offer objects.
        // 2.3.1 Write a program that can remove the offer objects that are not full-time

        ArrayList<Offer>  fullTimeOffers = new ArrayList<>();

        fullTimeOffers.addAll(Arrays.asList(myOffers));

        fullTimeOffers.removeIf(each -> each.isFullTime == false);

        System.out.println(fullTimeOffers);

        System.out.println("-------------------------------------------");

        //2.4 Create an ArrayList of Offer named localOffers and add all the offer objects.
        //2.4.1 Write a program that can remove all the offers that are not from local

        ArrayList<Offer> localOffers = new ArrayList<>(Arrays.asList(myOffers));

        localOffers.removeIf(each -> !each.location.equalsIgnoreCase("USA"));

        System.out.println(localOffers);

        System.out.println("-----------------------------------");


        //2.5 Create an ArrayList of Offer named offersWithBenefits and add all the offer objects.
        //2.5.1 Write a program that can remove all the offers that does not have benefit and does not have PTO

        ArrayList<Offer> offersWithBenefits = new ArrayList<>(Arrays.asList(myOffers));

        offersWithBenefits.removeIf(each -> (each.hasBenefit == false)&& (each.hasPTO == false ));

        System.out.println(offersWithBenefits);

        System.out.println("-----------------------------------");

        //  2.6 Create an ArrayList of Offer named devOffers and add all the offer objects.
        //  2.6.1 Write a program that can remove all the offers that does not contain developer in the jobTitle

        ArrayList<Offer> devOffers = new ArrayList<>(Arrays.asList(myOffers));

        devOffers.removeIf(each -> !each.jobTitle.contains("Dev") );

        System.out.println(devOffers);

        System.out.println("--------------------------------------");

        //2.7 Create an ArrayList of Offer named offers With100K and add all the offer objects.
        //2.7.1 Write a program that can remove all the offers that are offering less than 100K salary

        ArrayList<Offer> offersWith100K = new ArrayList<>(Arrays.asList(myOffers));

        offersWith100K.removeIf(each -> each.salary < 100000);

        System.out.println(offersWith100K);



    }

}
/*
Task05:
    Create a custom class named Offer
            Attributes:
                    location, companyName, jobTitle, salary, hasBenefit, hasPTO, isWFH, isFullTime

                Add a constructor that can set all the fields

            Actions:
                toString(): returns the full info of the Offer Object

    2. Create a class named MyOffers:

            2.1 Create 7 objects of Offer
            2.2 Create an array of Offers named myOffers and store all 7 objects of offers
            2.3 Create an ArrayList of Offer named fullTimeOffers and add all the offer objects.
                    2.3.1 Write a program that can remove the offer objects that are not full-time
            2.4 Create an ArrayList of Offer named localOffers and add all the offer objects.
                    2.4.1 Write a program that can remove all the offers that are not from local
            2.5 Create an ArrayList of Offer named offersWithBenefits and add all the offer objects.
                    2.5.1 Write a program that can remove all the offers that does not have benefit and does not have PTO
            2.6 Create an ArrayList of Offer named devOffers and add all the offer objects.
                    2.6.1 Write a program that can remove all the offers that does not contain developer in the jobTitle

            2.7 Create an ArrayList of Offer named offers With100K and add all the offer objects.
                    2.7.1 Write a program that can remove all the offers that are offering less than 100K salary

 */

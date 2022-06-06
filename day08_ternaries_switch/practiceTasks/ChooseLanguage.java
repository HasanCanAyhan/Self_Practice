package day08_ternaries_switch.practiceTasks;

public class ChooseLanguage {

    public static void main(String[] args) {


        int n = 2;

        String selected = (n >= 1 && n <= 5 ) ?

                (n == 1) ? "Hello, thank for your call" :(n == 2)? "Hola, gracias para llamar" :(n == 3) ? "Merhaba, aradiginiz icin tesekkurler"
                :(n == 4)?"Privet, spasibo za vash zvonok"  : "Merci ,pour votre appel"

                :"Invalid Number";

        System.out.println(selected);


        // Solution 2 : Switch

        int num = 2;

        String result = "";

        switch (num){

            case 1 :
                result = "Hello, thank for your call";
                break;

            case 2 :
                result = "Hola, gracias para llamar";
                break;

            case 3 :
                result = "Merhaba, aradiginiz icin tesekkurler";
                break;

            case 4 :
                result = "Privet, spasibo za vash zvonok";
                break;

            case 5 :
                result = "Privet, spasibo za vash zvonok";
                break;

        }

        System.out.println(result);

    }
}
/*
5. Create a class called ChooseLanguage,
 		Given an integer variable named selection that has a number between 1~5.
 		Write a program that can select the language based on the number that's given in selection and prints the following message:

			for 1: Hello, thank for your call
			for 2: Hola, gracias para llamar
			for 3: Merhaba, aradiginiz icin tesekkurler
			for 4: Privet, spasibo za vash zvonok
			for 5: Merci ,pour votre appel

			for any other numbers print "Invalid Number"

		Solution 1: Must use ternary
		Solution 2:	MUST use switch statement

 */

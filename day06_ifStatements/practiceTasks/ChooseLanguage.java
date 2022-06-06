package day06_ifStatements.practiceTasks;

public class ChooseLanguage {

    public static void main(String[] args) {

        int selection = 3;  // selection must be  a number between 1~5,

        String message = "";

        if (selection == 1){
            message = "Hello, thank for your call";
        }
        if (selection == 2){
            message = "Hola, gracias para llamar";
        }
        if (selection == 3){
            message = "Merhaba, aradiginiz icin tesekkurler";
        }
        if (selection == 4){
            message = "Privet, spasibo za vash zvonok";
        }
        if (selection == 5){
            message = "Merci ,pour votre appel";
        }

        System.out.println("message = " + message);
        

    }

}
/*
4. Creata a class named ChooseLanguage, Given an integer variable named selection that has a number between 1~5, Write a program that can select the language based on the number that's given in selection and prints the following message:

		for 1: Hello, thank for your call
		for 2: Hola, gracias para llamar
		for 3: Merhaba, aradiginiz icin tesekkurler
		for 4: Privet, spasibo za vash zvonok
		for 5: Merci ,pour votre appel

	Note: Do not use more than one print statement
 */
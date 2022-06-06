package day06_ifStatements.practiceTasks;

public class CharacterIdentity {

    public static void main(String[] args) {


        char character  = 125;

        // According to ASCII table :

        boolean isAlphabeticCharacter =  character >= 65 && character <= 90 || character >= 97 && character <= 122,
                isNumber = character >= 48 && character <= 57;

            String result = "";

            if (isAlphabeticCharacter){
                result = "AlphabeticCharacter";
            }
            if (isNumber){
                result = "Digit";
            }
            if (!isAlphabeticCharacter && !isNumber){
                result = "Special Character";
            }

        System.out.println("result = " + result);


    }


}
/*
5. Create a class named CharacterIdentity, and write a program that can identify if the given character is a digit or Alphabetic Character(A~Z or a~Z) or a special character

		Ex:
			ch = '@'

		output:
			Special Character


			ch = '1'

		output:
			digit

		HINT: You may wanna check out the numbers of the chracters on ASCII table


 */
package day07_ifStatements.practiceTasks;

public class CappuccinoBuyer {

    public static void main(String[] args) {


        String  size = "grande";

        String result = "price and calories : $";


      if (size.equals("tall") || size.equals("grande")  || size.equals("venti")){

          if (size.equals("tall")){
              result += "3.69 - 90 calories";
          } else if (size.equals("grande")){
              result += "3.99 - 120 calories";
          }else {
              result += "4.29 - 150 calories";
          }


      }else{
          result = "Invalid Size";
      }

        System.out.println(result);




    }

}
/*

1. Create a class called  CappuccinoBuyer. A variable named Size is given, write a program that can display the price and calories of cappuccino

			Valid sizes are tall, grande, venti and thier price & calories are:

						tall:
								price is $3.69
								90 calories

						grande:
								price is $3.99;
								120 calories

						venti:
								price is $4.29
								150 calories

			If the size is invalid then the output shoud be "Invalid Size"

			Note: MUST use nested if
 */

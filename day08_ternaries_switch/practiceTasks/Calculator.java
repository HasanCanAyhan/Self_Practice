package day08_ternaries_switch.practiceTasks;

public class Calculator {

    public static void main(String[] args) {


        int n1 = 1;
        int n2 = 2;

        char mathOperator = 'ö'; // char operator -> -, +, *, /

        String result = "";

        switch (mathOperator){

            case '+':
                result = "add : " + (n1 + n2);
                break;

            case '-':
                result = "minus : " + (n1 - n2);
                break;

            case '*':
                result = "multiply : " + (n1 + n2);
                break;

            case '/':
                result = "divide : " + (n1 / n2);
                break;

            default:
                result = "Invalid Operator";
                break;


        }

        System.out.println(result);




    }

}
/*
7. Create a class called Calculator, Given two double variables named n1 & n2, and a char variable named mathOperator, write a program that can calculate result of n1&n2 based on the given math Operator.

		char operator -> -, +, *, /

		when operator is + : add num1, num2
		when operator: - : minus num1, num2
		when operator: * : multiply num1, num2
		when operator: / : divide num1, num2
		for any other operators: print "invalid operator"

		Ex:
			n1 = 10, n2= 20, mathOperator = '+'

		output:
			30

		Note: MUST use switch statement
 */
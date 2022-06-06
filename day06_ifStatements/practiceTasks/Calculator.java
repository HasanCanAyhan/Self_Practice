package day06_ifStatements.practiceTasks;

public class Calculator {

    public static void main(String[] args) {

        int n1 = 10,
                n2 = 20;
        char mathOperator = '+';

        if (mathOperator == '+') {
            System.out.println(n1 + n2);
        }
        if (mathOperator == '-') {
            System.out.println(n1 - n2);
        }
        if (mathOperator == '*') {
            System.out.println(n1 * n2);
        }
        if (mathOperator == '/') {
            System.out.println(n1 / n2);
        }

        /*   Another Solution :

        Scanner input = new Scanner(System.in);
        int result = 0;
        System.out.println("First number");
        int n1 = input.nextInt();
        System.out.println("Second number");
        int n2 = input.nextInt();
        System.out.println("Math operator");
        char mathOperator = input.next().charAt(0);
        if(mathOperator == '+'){
            result = n1 + n2;
        }
        if(mathOperator == '-'){
            result = n1 - n2;
        }
        if(mathOperator == '*'){
            result = n1 * n2;
        }
        if(mathOperator == '/'){
            result = n1 / n2;
        }
        System.out.println(result);


         */



    }


}
/*

3. Create a class called Calculator, Given two double variables named n1 & n2, and a char variable named mathOperator, write a program that can calculate result of n1&n2 based on the given math Operator.

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

 */
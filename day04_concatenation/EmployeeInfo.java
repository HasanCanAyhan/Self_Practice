package day04_concatenation;

public class EmployeeInfo {

    public static void main(String[] args) {

        String name = "Can",
                gender = "Male",
                company_name = "Tesla in Germany",
                jobTitle = "Java Developer";

        int age = 27,
                salary = 90000;

        System.out.println("\t" + name + " is " + age + " years old," + "gender is " + gender + "." +
                "\n\t" + name + " works at " + company_name + " as a " + jobTitle + "."+
                "\n\t" + name + " makes $ " + salary + " per year.");




    }


}

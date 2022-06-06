package day12_customMethods;

public class emailDomain { // Task1

    public static void main(String[] args) {


      emailDomain("Cydeo@gmail.com");


    }

    public static void emailDomain(String domain) {



        domain =  domain.substring(domain.indexOf("@") +1,domain.indexOf("."));

        System.out.println(domain);





    }
}

/*
1. Create a method named emailDomain that can display the domain of the email
    Ex:
        emailDomain("Cydeo@gmail.com")

        output:
            domain: gmail

 */


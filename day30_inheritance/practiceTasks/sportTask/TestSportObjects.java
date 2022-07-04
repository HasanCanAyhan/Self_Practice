package day30_inheritance.practiceTasks.sportTask;

public class TestSportObjects {

    public static void main(String[] args) {

        Basketball basketball = new Basketball("lots of rules",12,4);

        Baseball baseball = new Baseball("loads of rules",8,2);

        Football football = new Football("too many rules", 22,3);

        AmericanFootball americanFootball = new AmericanFootball("heaps of rules",5,6);


        System.out.println(basketball);
        System.out.println(baseball);
        System.out.println(football);
        System.out.println(americanFootball);

    }

}

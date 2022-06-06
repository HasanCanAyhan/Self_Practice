package day18_garbageCollection.practiceTasks;

public class TestContactObjects {

    public static void main(String[] args) {

        Contact obj1 = new Contact();
        obj1.setInfo("Can",0123456677,"I am busy!");
        System.out.println(obj1);

        obj1.call();

        obj1.sendMessage();

        obj1.sendEmail();


    }
}

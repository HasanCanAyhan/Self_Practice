package day29_inheritance.practiceTasks.phoneTask;

public class TestPhoneObject {

    public static void main(String[] args) {

        Iphone iphone1 = new Iphone();
        iphone1.setInfo("Apple","X","12.5","Black",1500 );

        iphone1.call(12345677);
        iphone1.text(12344578);

        iphone1.faceTime("can@hotmail.com");
        iphone1.faceTime(12345666);

        System.out.println(iphone1);

        System.out.println("-----------------------------------------------");

        Samsung samsung1 = new Samsung();
        samsung1.setInfo("Samsung","Galaxy 10","12.5","Black",1250);

        samsung1.call(1234666);
        samsung1.text(13455);
        samsung1.freeze();

        System.out.println(samsung1);

        System.out.println("-----------------------------------------------");

        Nokia nokia1 = new Nokia();
        nokia1.setInfo("Nokia","model","size","Black",850);

        nokia1.call(12355);
        nokia1.text(13556);

        nokia1.selfDefense();
        System.out.println(nokia1);

    }



}

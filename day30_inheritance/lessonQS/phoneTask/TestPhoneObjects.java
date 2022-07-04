package day30_inheritance.lessonQS.phoneTask;

public class TestPhoneObjects {

    public static void main(String[] args) {

        Iphone iphone = new Iphone("IPhone 12","Large","Black",1000.5);

        Samsung samsung = new Samsung("Galaxy S22","Medium","White",1100);

        Nokia nokia = new Nokia("Brick","Small","Pink",50);

        iphone.call(911);
        samsung.call(911);
        nokia.call(911);


        iphone.text(1224445);
        samsung.text(1224445);
        nokia.text(1224445);

        System.out.println("----------------------------------");

        iphone.faceTime(1234566);
        //samsung.faceTime(12344566);
        //nokia.faceTime(12344566);

        samsung.freeze();
        //iphone.freeze();
        //nokia.freeze();



        nokia.selfDefense();
        //iphone.selfDefense();
        //samsung.selfDefense();

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

    }

}

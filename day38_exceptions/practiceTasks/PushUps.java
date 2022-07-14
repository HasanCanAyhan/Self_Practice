package day38_exceptions.practiceTasks;

public class PushUps {

    public static void main(String[] args) throws InterruptedException {


        for (int i = 0; i < 30 ; i++) {

            System.out.println(i);
            Thread.sleep( 1500);

        }


        for (int i = 0; i < 20 ; i++) {

            System.out.println(i);
            Thread.sleep( 2500);

        }

        System.out.println("----------------------");

        String excercise1 = "push-ups";


        // or :
        for (int i = 0; i < 30; i++) {
            System.out.println(excercise1);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }




    }

}
/*
2. MorningWorkOut:
            1. Do 30 push-ups and try pausing 1.5 seconds in each

            2. Do 20 Pull-ups and try pausing 2.5 seconds in each
 */
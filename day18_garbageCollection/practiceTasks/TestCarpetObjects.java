package day18_garbageCollection.practiceTasks;

public class TestCarpetObjects {

    public static void main(String[] args) {

        Carpet carpet1 = new Carpet();
        carpet1.setInfo(12.5,22.5,10,false);
        System.out.println(carpet1);

        carpet1.calcCost();


    }

}

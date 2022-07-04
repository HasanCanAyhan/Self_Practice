package day30_inheritance.practiceTasks.planetTask;

public class TestPlanetObjects {

    public static void main(String[] args) {

        Earth earth = new Earth(58.5,2,45,9.81,7.96);

        Moon moon = new Moon(45.6,4,12.5,1.62,0);

        Mercury mercury = new Mercury(50,5,1.82,1.67,0);

        Venus venus = new Venus(46,6,67.9,9.80,0);


        System.out.println(earth);
        System.out.println(moon);
        System.out.println(mercury);
        System.out.println(venus);


    }

}

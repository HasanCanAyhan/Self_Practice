package day30_inheritance.practiceTasks.deviceTask;

public class Computer extends Device{

    private int RAM;

    public Computer(String brand, String model, String color, String size, double price, boolean hasBattery, boolean hasPowerButton, int RAM) {
        super(brand, model, color, size, price, hasBattery, hasPowerButton);
        setRAM(RAM);
    }


    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public void freeze(){
        System.out.println(getBrand() + " " + getModel() + " freezes due to old version");
    }


}

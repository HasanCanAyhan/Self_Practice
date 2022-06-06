package day17_customClass.practiceTasks;

public class AddressObjects {// Task 5

    public static void main(String[] args) {


        Address address1 = new Address();

        address1.setInfo(7925,"Jones Branch Dr","McLean","Va",22012);

        System.out.println(address1);




    }
}
/*
5. Create a class named Address
    Attributes:
        buildingNumber, street, city, state, zipCode

    Actions
            setInfo: sets all the instances
            toString: returns the address
                        EX:
                            7925 Jones Branch Dr
                            McLean Va, 22012


 */
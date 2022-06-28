package PracticeTasks_Muhtar_Solutions.day19_array;

public class Items {

    public static void main(String[] args) {

        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};

        String result = "";

        boolean hasIpad = false;

        int indexOfGloves = -1;

        for (int i = 0; i < items.length; i++) {

            String itemName = items[i];
            double price = prices[i];
            int itemId = itemIDs[i];




            if(items[i].equals("Gloves")){
                indexOfGloves = i;
            }


            if (items[i].contains("iPad")) {
                hasIpad = true;
            }

            result += itemName + " - " + price + " - " + itemId + "\n";

        }

        System.out.println("indexNumOfGloves = " + indexOfGloves);
        System.out.println("hasIPad = " + hasIpad);
        System.out.println(result);









    }


}
/*
Given the following arrays:
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};
        1. find out the first index number of "Gloves"
        2. find out if "iPad" is contained in the item list
        3. Print the report of each shopping item
            name - price - #ID
 */
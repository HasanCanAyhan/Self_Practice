package day23_arrayList.lessonQS;

import java.util.ArrayList;

public class FirstUniqueElement {

    public static void main(String[] args) {


        // for ArrayList you can not use Arrays Literal { ....}

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);
        list.add(6);

        System.out.println(list);


        for (Integer eachElement : list) { // ex : list.get(0) = 1

            int frequency = 0;

            for (Integer eachElementOfList : list) {

                if(eachElement == eachElementOfList){
                    frequency++;
                }

            }

            if (frequency == 1){
                System.out.println(eachElement); // 2
                break;// exit the loop, in order to return the first unique element only
            }

        }



    }


}
/*
3. Write a program that can return the first unique elements from an array list
            Ex:
                ArrayList = {1, 1, 2, 3, 3, 4, 5, 5, 6}

            output:
                2
 */

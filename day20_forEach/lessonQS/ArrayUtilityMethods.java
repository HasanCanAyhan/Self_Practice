package day20_forEach.lessonQS;

import java.util.Arrays;

public class ArrayUtilityMethods {

    public static void main(String[] args) {

        // Arrays Class : presented in " java.util" package
        /*
        methods:
            toString()
            sort()
            equals()
            copyOf()
            copyOfRange()

         */

        // toString() : Returns a string representation of the contents of this array
        // equals() : Returns boolean, checks if both the arrays are equal or not.
        // sort() : sorts the complete array in ascending order from smallest to largest
        // copyOf(array, new length) :  Returns new array, copies the specified array, (truncating or padding with zeros if necessary)
        // copyOfRange(array, begIndex, endIndex) : Returns new array, copies the specified range of the specified array


        //-----------------------------------------------------------

        // sort() : sorts the complete array in ascending order from smallest to largest

        int[] nums = {100, 80, 90, 75, 88, 99, 0, 5, 4, 1000, 500};

        System.out.println(Arrays.toString(nums)); // [100, 80, 90, 75, 88, 99, 0, 5, 4, 1000, 500]

        Arrays.sort(nums);

        System.out.println("nums = " + Arrays.toString(nums)); // [0, 4, 5, 75, 80, 88, 90, 99, 100, 500, 1000]
        System.out.println("minNumber = " + nums[0]); // 0
        System.out.println("maxNumber = " + nums[nums.length-1]); // 1000


        System.out.println("--------------------------------------------------------");

        // copyOf()

        // merge 2.Approach

        int[] n1 = {1,2,3,4,5};
        int[] n2 = {6,7,8,9,10,11,12};

        int[] n3 = Arrays.copyOf(n1,n1.length + n2.length);

        System.out.println("n3 = " + Arrays.toString(n3)); // n3 = [1, 2, 3, 4, 5, 0, 0, 0, 0, 0, 0, 0]

        for (int i = 0, j = n1.length ; i < n2.length; i++) {

            n3[j++] = n2[i];

        }

        System.out.println("n3 = " + Arrays.toString(n3)); // n3 = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]


        System.out.println("--------------------------------------------------------");


        char[] ch = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        //  index:    0    1    2    3    4    5    6

        char[] sub = Arrays.copyOfRange(ch,2,ch.length);
        System.out.println("sub = " + Arrays.toString(sub)); // [C, D, E, F, G]


        System.out.println("----------------------------------------------------------");

        String[] str = {"Ali","Ower","John","Can"};

        String[] sub_str = Arrays.copyOfRange(str, 3,str.length);
        System.out.println("sub_str = " + Arrays.toString(sub_str)); // [Can]

        sub_str = Arrays.copyOfRange(str,1,str.length);
        System.out.println("sub_str = " + Arrays.toString(sub_str)); // [Ower, John, Can]





    }


}

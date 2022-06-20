package day24_dateAndTime.practiceTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SecondMaxMinNumberFromArrList { // Task 5

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 1, -2, -2, -2, 3, 4, 5, 6, 7, 8, 8, 8, 8));

        int max = Collections.max(list);

        int min = Collections.min(list);

        list.removeIf(each -> each == max);
        list.removeIf(each -> each == min);

        int secondMax = Collections.max(list);
        int secondMin = Collections.min(list);

        System.out.println("secondMin = " + secondMin); //  secondMin = 1
        System.out.println("secondMax = " + secondMax); //  secondMax = 7





    }

}
/*
5. Write a program that can display the second maximum and minimum numbers from an arraylist of integers
		ex:
			list = {1, 1, -2, -2, -2, 3, 4, 5, 6, 7, 8, 8, 8, 8}

		output:
			second maximum number is 7
			second minimum number is 1

	Note: DO NOT use any loops
 */
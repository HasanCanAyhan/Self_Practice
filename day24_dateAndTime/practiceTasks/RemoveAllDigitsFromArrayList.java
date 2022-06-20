package day24_dateAndTime.practiceTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveAllDigitsFromArrayList {

    public static void main(String[] args) { // Task 2

        ArrayList<Character> list= new ArrayList<>();
        list.addAll(Arrays.asList('$', 'A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'));

        list.removeIf(each -> Character.isDigit(each));

        System.out.println(list); // ['$', A', 'B', 'C', 'D', '@', '!']


    }

}
/*
2. Write a program that can remove all the digits from an arraylist of characters
		ex:
			list = {'$', A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'}

		output:
			['$', A', 'B', 'C', 'D', '@', '!']

	Note: DO NOT use any loops
 */
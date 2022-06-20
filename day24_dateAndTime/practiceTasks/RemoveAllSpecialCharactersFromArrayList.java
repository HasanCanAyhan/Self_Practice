package day24_dateAndTime.practiceTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAllSpecialCharactersFromArrayList { // Task 4

    public static void main(String[] args) {


        ArrayList<Character> list= new ArrayList<>();
        list.addAll(Arrays.asList('$', 'A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'));


        list.removeIf(each ->  !Character.isLetterOrDigit(each));

        System.out.println(list); // [A, B, 1, 2, C, D, 3, 4]


    }

}
/*
4. Write a program that can remove all the special characters from an arraylist of characters
		ex:
			list = {'$', A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'}

		output:
			[A', 'B', '1', '2', 'C', 'D', '3', '4']

	Note: DO NOT use any loops
 */
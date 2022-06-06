package day06_ifStatements.practiceTasks;

public class EqualNumbers {

    public static void main(String[] args) {

        int n1 = 30,
            n2 = 30,
            n3 = 30;

        if (n1 == n2 && n2 == n3 & n1 == n3){
            System.out.println("all equal");
        }
        if (n1 == n2 && n2 != n3){
            System.out.println("n1 & n2 are equal");
        }
        if (n2 == n3 && n1 != n3){
            System.out.println("n2 & n3 are equal");
        }
        if (n1 == n3 && n2 != n3){
            System.out.println("n1 & n3 are equal");
        }
        if (n1 != n2 && n2 != n3 & n1 != n3){
            System.out.println("none of them are equal");
        }


    }


}
/*
2. Create a class named EqualNumbers, and write a program that can check the equality of the three given numberrs
	 			declare 3 numbers n1, n2, n3
	 			if all are equal ==> print "all equal"
	  			if only n1 and n2 are equal  =>print  "n1&n2 are equal"
	   			if only n2 and n3 are equal ==>print "n2&n3 are equal"
	   			if only n3 and n1 are qual ==>print "n3&n1 are equal"
				if none of them are euqal ==> none of them are equal
 */
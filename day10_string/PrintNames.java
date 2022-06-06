package day10_string;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class PrintNames {

    public static void main(String[] args) throws IOException {

        // ReadFilesWithScanner  file : MyClassmates.txt

        Scanner scan = new Scanner( Path.of( "src/day10_string/MyClassmates.txt"   )  );


        System.out.println( scan.nextLine()   );
        System.out.println( scan.nextLine()   );
        System.out.println( scan.nextLine()   );
        System.out.println( scan.nextLine()   );
        System.out.println( scan.nextLine()   );
        System.out.println( scan.nextLine()   );
        System.out.println( scan.nextLine()   );
        System.out.println( scan.nextLine()   );
        System.out.println( scan.nextLine()   );

        scan.close();

    }

}
/*

1. Create a text file named MyClassmates.txt
            1.2 store 10 of your class mates' full names in seperate lines
    2. Create class named PrintNames,
    and write program that can read MyClassmates.txt
    and print the names of those 10 students
 */
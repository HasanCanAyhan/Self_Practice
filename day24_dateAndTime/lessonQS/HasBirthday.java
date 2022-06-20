package day24_dateAndTime.lessonQS;

import java.time.LocalDate;

public class HasBirthday {

    public static void main(String[] args) {


        System.out.println(hasBirthday(1995,3,24));


    }

    public static String hasBirthday( int year, int month , int day){

        LocalDate birthday = LocalDate.of(year,month,day);


        if (birthday.getMonthValue() == LocalDate.now().getMonthValue() && birthday.getDayOfMonth() == LocalDate.now().getDayOfMonth()){
            int age = LocalDate.now().getYear() - birthday.getYear();
           return ("Happy Birthday" + "\n" + "your age is " + age + "years old.");
        }else{
            return "Today is not your birthday";
        }



    }


}
/*
Create a function named birthday, that takes three int arguments:
  1. year
  2. month
  3. day

the function should be able to print the age and "Happy birthday" if today is the birthday
otherwise the function will print "Today is not your birthday.
      ex:
          birthday(1993, 6, 16);
      output:
            Happy Birthday
            You are 29 years old
 */

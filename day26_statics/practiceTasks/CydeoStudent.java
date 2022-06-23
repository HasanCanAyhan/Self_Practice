package day26_statics.practiceTasks;

public class CydeoStudent { // Task1

    public String name;
    public int age;
    public char gender;
    public String id;
    public String grade;
    public int batchNumber,groupNumber;

    public static String schoolName = "Cydeo School";
    public static String magicWord = "Java Programming Language";



    public CydeoStudent(String name, int age, char gender, String id, String grade, int batchNumber, int groupNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
        this.grade = grade;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }

    public void study(){
        System.out.println(name + " is studying.");
    }

    public void  attendClass(){
        System.out.println(name + " attends the class regularly.");
    }

    public static void printSchoolName(){
        System.out.println(schoolName);
    }

    public static void printProgLanguage(){
        System.out.println(magicWord);
    }


    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id='" + id + '\'' +
                ", grade='" + grade + '\'' +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                '}';
    }


}
/*
1. CydeoStudent Task
		1. Create a class named CydeoStudent:

				Attributes:
					instances: name, age, gender, id, grade, batchNumber, groupNumber
					statics: schoolName, magicWord

				Add a constructor that can set All the fields (instances)

				Actions:
					study()
					attendClass()
					printSchoolName(): displays the school name
					printProgLanguage(): displays the name of programming language
					toString()

 */
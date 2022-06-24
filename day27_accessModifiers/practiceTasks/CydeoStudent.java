package day27_accessModifiers.practiceTasks;

public class CydeoStudent { // Task 2


    public String name;
    public char gender;
    public int age;
    public  String groupNumber;

    public static String batchNumber;
    public static String schoolName;
    public static String fieldOfStudy;
    public static String programmingLanguage;
    public static String secretCode;


    public CydeoStudent(String name, char gender, int age, String groupNumber) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.groupNumber = groupNumber;
    }

    static {

        batchNumber = "Cydeo US1";
        schoolName = "Cydeo School";
        fieldOfStudy = "Back End ";
        programmingLanguage = "Java";
        secretCode = "Wooden Spoon";

    }

    public static void printSchoolName(){
        System.out.println("schoolName = " + schoolName);
    }

    public static void printSecretCode(){
        System.out.println("secretCode = " + secretCode);
    }

    public void attendClass(){
        System.out.println("name = " + name + " is attending the class today");
    }

    public void  study(){
        System.out.println(name + " is studying" );
    }


    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", groupNumber='" + groupNumber + '\'' +
                '}';
    }
}
/*
2.create a class named CydeoStudent
            Variables:
                name, gender, age, batchNumber, groupNumber, schoolName, fieldOfStudy, programmingLanguage, secretCode

            Add a constructor to initialize all the fields

            Add a static block to initialize all the statics

            methods:
                printSchoolName();
                printSecretCode();
                attendClass():
                study()
                toString()
 */

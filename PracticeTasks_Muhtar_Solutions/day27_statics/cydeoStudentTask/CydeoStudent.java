package PracticeTasks_Muhtar_Solutions.day27_statics.cydeoStudentTask;

public class CydeoStudent {

    public String name;
    public int age;
    public char gender;
    public int id;
    public int batchNumber, groupNumber;
    public char grade;

    public static String schoolName;
    public static String programmingLanguage;
    public static String secretCode;

    public CydeoStudent(String name, int age, char gender, int id, int batchNumber, int groupNumber, char grade) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.grade = grade;
    }

    static {
        schoolName = "Cydeo School";
        programmingLanguage = "Java";
        secretCode = "Wooden Spoon";
    }


    public static void  printSchoolName(){
        System.out.println(schoolName);
    }

    public static void secretCode(){
        System.out.println(secretCode);
    }

    public static void programmingLanguage(){
        System.out.println(programmingLanguage);
    }

    public void attendClass(){
        System.out.println(name + " is attending " + programmingLanguage + " class");
    }

    public void study(){
        System.out.println(name + " is studying");
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", grade=" + grade +
                '}';
    }
}
/*
2. create a class named CydeoStudent
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
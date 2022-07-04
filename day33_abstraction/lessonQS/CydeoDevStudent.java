package day33_abstraction.lessonQS;

import day32_finalKeyword.lessonQS.personTask.Person;

import java.time.LocalDate;

public final class CydeoDevStudent extends Person { // if it is final, then the CydeoDevStudent can not have child , so can not be extended.

    // package 32 continue personTask

    private final String id; // once it is set, then after setting,  it can not be changeable. Only one time it will be set!
    private String batchName;
    private int batchNumber;

    public final static  String programmingLanguage;


    public CydeoDevStudent(String name, char gender, LocalDate dateOfBirth, String id, String batchName, int batchNumber) {
        super(name, gender, dateOfBirth);// it has to be first
        //Age has to be at least 18 years old
        if (getAge() < 18 ){// if age is set to less than 18
            System.err.println("Cydeo Developer has to be at least 18 years old");
            System.exit(1);
        }

        this.id = id; // it is final variable we do not have setters for that
        setBatchName(batchName);
        setBatchNumber(batchNumber);
    }


    static {
        programmingLanguage = "Java";
    }


    // 3 getters
    public String getId() {
        return id;
    }

    public String getBatchName() {
        return batchName;
    }

    public int getBatchNumber() {
        return batchNumber;
    }


    // 2 setters
    public void setBatchName(String batchName) {

        if (batchName.equalsIgnoreCase("zero to hero") || batchName.equalsIgnoreCase("alumni dev")){
            this.batchName = batchName;
        }else{// otherwise: if the batch name is invalid
            System.err.println("Invalid batch name: " + batchName + " \nNo such a batch at Cydeo");
            System.exit(1);
        }
    }

    public void setBatchNumber(int batchNumber) {

        if (batchNumber <= 0){
            System.err.println("Invalid batch number: "+batchNumber+"\nBatch number can not be negative or zero");
            System.exit(1);
        }

        this.batchNumber = batchNumber;
    }

    //Override the eat() & drink() methods and include the programmingLanguage variable in methods body


    @Override
    public void eat() {
        System.out.println(getName() + " is eating " + programmingLanguage);
    }

    @Override
    public void drink() {
        System.out.println(getName() + " is drinking " + programmingLanguage);
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " does not need to sleep");
    }

    // breath method can not be overridden because it is final method


    @Override
    public String toString() {
        return "CydeoDevStudent{" +
                "name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", dateOfBirth=" + getDateOfBirth() +
                ", id='" + id + '\'' +
                ", batchName='" + batchName + '\'' +
                ", batchNumber=" + batchNumber +
                '}';
    }




}
/*
Warmup tasks:
	1. Create a sub class of Person (from day32 package) named CydeoDevStudents (final)
			Extra Variables:
				id (final), batchName, batchNumber, programmingLanguage(static & final)

			Extra conditions:
					1. Age has to be at least 18 years old
					2. batchName can ONLY be set to "Zero to Hero" or "Alumni Dev"
					3. batchNumber can not be set to zero or negative

			Override the eat() & drink() methods and include the programmingLanguage variable in methods body

			Override the toString Method and include the id, batchName, batchNumber variables
 */
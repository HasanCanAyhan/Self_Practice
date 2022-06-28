package day28_encapsulation.lessonQS.encapsulation;

public class Student {

    private String name;

    private int age; //controlling over the data



    public String getName() {

        if (name == null){
            System.err.println("Name has not been set");
            System.exit(1);
        }

        return name;
    }




    public void setName(String name) {

        boolean hasDigit = false;

        for (char each : name.toCharArray()) {

            if(Character.isDigit(each)){
                hasDigit = true;
                break;
            }

        }

        if (hasDigit){ // if it is true, that means it has Digits inside the name
            System.err.println("Invalid name: " + name );
            System.exit(1);
        }

        this.name = name;
    }


    //-----------------------------------------------------------

    public int getAge(){ // we can access the private variable within the same class

        if(age == 0){ // 0 means default value
            System.err.println("Age has not been set");
            System.exit(1);
        }

        return age;
    }// ONLY READ THE DATA



    public void setAge(int age){

        if(age < 1 || age > 100){ // if age is invalid
            System.err.println("Invalid Age: " +age);
            //return;// exiting the method
            System.exit(1);// that means something wrong, program gets terminated
        }

        this.age = age;
    }// ONLY WRITE-MODIFYING THE DATA



}

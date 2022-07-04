package day33_abstraction.lessonQS.animalTask;

public abstract class Animal {

    private String name, breed;
    private final char gender;


    public Animal(String name, String breed, char gender) {
        setName(name);
        setBreed(breed);
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public char getGender() {
        return gender;
    }


    public abstract void eat();



    public String toString() {
        return   getClass().getSimpleName() +"{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                '}';
    }
}

package day31_inheritance.practiceTasks.statesTask;

public class States { // Task 1

    private String name, abbreviation, politicalParty, Governor, senator;
    private double population, stateTax;


    public States(String name, String abbreviation, String politicalParty, String governor, String senator, double population, double stateTax) {
        setName(name);
        setAbbreviation(abbreviation);
        setPoliticalParty(politicalParty);
        setGovernor(governor);
        setSenator(senator);
        setPopulation(population);
        setStateTax(stateTax);
    }

    public void exitSystem(String arg){
        if (arg == null || arg.trim().isEmpty()){
            System.err.println("Invalid!!!");
            System.exit(1);
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {

       exitSystem(name);

        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        exitSystem(abbreviation);

        this.abbreviation = abbreviation;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {
        exitSystem(politicalParty);
        this.politicalParty = politicalParty;
    }

    public String getGovernor() {
        return Governor;
    }

    public void setGovernor(String governor) {
        exitSystem(governor);
        Governor = governor;
    }

    public String getSenator() {
        return senator;
    }

    public void setSenator(String senator) {
        exitSystem(senator);
        this.senator = senator;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        if(population <= 0){
            System.err.println("Invalid population: " + population);
            System.exit(1);
        }


        this.population = population;
    }

    public double getStateTax() {
        return stateTax;
    }

    public void setStateTax(double stateTax) {
        if(stateTax < 0){
            System.err.println("Invalid state tax: " + stateTax);
            System.exit(1);
        }

        this.stateTax = stateTax;
    }


    public String toString() {
        return "States{" +
                "name='" + name + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", politicalParty='" + politicalParty + '\'' +
                ", Governor='" + Governor + '\'' +
                ", senator='" + senator + '\'' +
                ", population=" + population +
                ", stateTax=" + stateTax +
                '}';
    }


}

/*
statesTask:
    1. Create a class named States:
            variables:
                name, abbreviation, politicalParty, Governor, senator, population, stateTax

            Encapsulate all the fields

            Add a constructor that can set all the fields

                        Conditions:
                            1. name, abbreviation, politicalParty, Governor, and senator can not be null/empty/blank
                            2. name, abbreviation, politicalParty, Governor, and senator can not be null/empty/blank
                            3. taxRate can not be negative
                            4. Population can not be zero or negative

            Methods:
                toString()

    2. Create the following sub classes of States and add any additional fields and methods if necessary:
                1. Virginia
                2. California
                3. Texas
                4. Florida


    3. Create a class named StateObjects
                    Create the objects of each sub classes

                    test all the functions of each objects

                    Analyze the relationships between the classes
 */

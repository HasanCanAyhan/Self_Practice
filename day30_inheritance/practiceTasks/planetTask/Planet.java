package day30_inheritance.practiceTasks.planetTask;

public class Planet { // Task 3 - Parent

    private String name;
    private double mass,radius,volume,surfaceGravity,population;

    public Planet(String name, double mass, double radius, double volume, double surfaceGravity, double population) {
        setName(name);
        setMass(mass);
        setRadius(radius);
        setVolume(volume);
        setSurfaceGravity(surfaceGravity);
        setPopulation(population);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getSurfaceGravity() {
        return surfaceGravity;
    }

    public void setSurfaceGravity(double surfaceGravity) {
        this.surfaceGravity = surfaceGravity;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public String toString() {
        return  getClass().getSimpleName() +"{" +
                "name='" + name + '\'' +
                ", mass=" + mass +
                ", radius=" + radius +
                ", volume=" + volume +
                ", surfaceGravity=" + surfaceGravity +
                ", population=" + population +
                '}';
    }


}
/*
planetTask:
	1. create a class called Planet
			variables:
					name, mass, radius, surfaceGravity, surfaceArea, volume, population

			Encapsulate all the fields

			Add a constructor that can set all the fields

			methods:
				toString()

	2. create the following subclasses of Planet
			1. Earth
			2. Moon
			3. Mercury
			4. Venus

			Note: you can search them on google

 */
package model;

import java.util.ArrayList;

public class Person {
	
	private String first_name;
	private String last_name;
	private String address;
	private ArrayList<Animal> animals = new ArrayList<Animal>();
	
	public Person(String first_name, String last_name, String address) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.address = address;
	}

	public void addAnimal(Animal animal){
		animals.add(animal);
	}
	public void deleteAnimal(int index){
		animals.remove(index);
	}
	
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAnimals() {
		String xt="";
		for(Animal x: animals)
			xt += x.toString();
		return xt;
	}

	@Override
	public String toString() {
		return first_name + " " + last_name + " has animals: " + getAnimals();
	}
	
	
	
	
	
	
}
/*\
 * 	Questions:
 * 	1. Currency
 *  2. Assignment 14 & 15
 *  3. Assignment 8
\*/

package controller;
import java.util.ArrayList;
import java.util.Arrays;
import utility.AnimalType;
import utility.insuranceCompany;
import model.Animal;
import model.Person;
import model.Pet;
import model.Treatment;

public class MainApp {
	
	//Main
	public static void main(String[] args) {
		printZoo();
		addTreatment(animals.get(3), treatments.get(0));
		addTreatment(animals.get(3), treatments.get(1));
		printZoo();
		((Pet) animals.get(2)).setInsurance(insuranceCompany.THREE,"5684");
		Person h1 = new Person("Louis","Le","Unknown");
		buyAnimal(h1, 4);
		buyAnimal(h1, 3);
		System.out.println(h1.toString());
		printZoo();
		addTreatment(animals.get(4), treatments.get(2));
		System.out.println(h1.toString());;
		remTreatment(animals.get(4), treatments.get(3));
		System.out.println(h1.toString());
	}
	
	//Arrays
	public static ArrayList<Treatment> treatments = new ArrayList<Treatment>();
	public static ArrayList<Animal> pettingZoo = new ArrayList<Animal>();
	public static ArrayList<Animal> animals = new ArrayList<Animal>();
		
	//Init
	static{
		//Animals
		Animal a1,a2;
		Pet p1,p2,p3;
		a1 = new Animal("Bella 1",10000,AnimalType.COW);
		a2 = new Animal("Bella 2",10000,AnimalType.COW);
		p1 = new Pet(null,null,"Hunter",10000,AnimalType.CAT);
		p2 = new Pet(insuranceCompany.ONE,"1","Fluffy",10000,AnimalType.RABBIT);
		p3 = new Pet(insuranceCompany.TWO,"2","Blackie",10000,AnimalType.DOG);
		Animal[] allA = {a1,a2};
		Pet[] allP = {p1,p2,p3};
		pettingZoo.addAll(Arrays.asList(allA));
		pettingZoo.addAll(Arrays.asList(allP));
		animals.addAll(Arrays.asList(allA));
		animals.addAll(Arrays.asList(allP));
		//Treatments
		Treatment t1,t2,t3,t3r;
		t1 = new Treatment("Antibiotics", 7, "USD");
		t2 = new Treatment("Power Food", 4, "USD");
		t3 = new Treatment("Gold Teeth",5000,"USD");
		t3r = new Treatment("Gold Teeth",-4500,"USD");
		Treatment[] allT = {t1,t2,t3,t3r};
		treatments.addAll(Arrays.asList(allT));
	}

	private static void printZoo(){
		System.out.println("The current petting zoo looks like:");
		for(Animal x: pettingZoo)
			System.out.println(x.toString());
		System.out.println();
	}
	private static void buyAnimal(Person human, int index){
		Animal t = animals.get(index);
		System.out.printf("%s buys %s for %s\n\n",human.getName(),t.getName(),t.getPriceAndCurrency());
		human.addAnimal(t);
		pettingZoo.remove(index);
	}
	private static void addTreatment(Animal animal, Treatment treatment){
		System.out.printf("%s applied to %s for %s\n\n",treatment.getName(),animal.getName(),treatment.getPriceAndCurrency());
		animal.addTreatment(treatment);
	}
	private static void remTreatment(Animal animal, Treatment treatment){
		System.out.printf("%s removed from %s. 90%s has been refunded.\n\n",treatment.getName(),animal.getName(),"% ("+treatment.getPriceAndCurrency().substring(1,treatment.getPriceAndCurrency().length())+")");
		animal.addTreatment(treatment);
	}
	
}
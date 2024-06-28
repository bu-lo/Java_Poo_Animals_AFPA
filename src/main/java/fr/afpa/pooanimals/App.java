package fr.afpa.pooanimals;

import java.util.ArrayList;

public class App {
	public static void main(String[] args) throws Exception {
		
		Animal landMammal1 = new LandMammal(null, null, null);
		Animal bird1 = new Bird(null, null, 0);
		Animal fish1 = new Fish(null, null, 0);
		Animal fish2 = new Fish(null, null, 0);
		Animal fish3 = new Fish(null, null, 0);

		System.out.println("landMammal1 : " + landMammal1 + "\n" + landMammal1.displayLocomotionType());
		System.out.println("bird1 : " + bird1 + "\n" + bird1.displayLocomotionType());
		System.out.println("fish1 : " + fish1 + "\n" + fish1.displayLocomotionType());
		System.out.println("fish2 : " + fish2 + "\n" + fish2.displayLocomotionType());
		System.out.println("fish3 : " + fish2 + "\n" + fish3.displayLocomotionType());

		System.out.println("\n-----------------------------------");

		//ARRAY LIST
		ArrayList<Animal> arrayAnimals = new ArrayList<>();

		arrayAnimals.add(landMammal1);
		arrayAnimals.add(bird1);
		arrayAnimals.add(fish1);
		arrayAnimals.add(fish2);
		arrayAnimals.add(fish3);

		//FOR EACH TO DISPLAY THE ARRAYLIST
		for (Animal animal : arrayAnimals){
			System.out.println(animal);
		}
	}
}



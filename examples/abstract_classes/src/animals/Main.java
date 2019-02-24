package animals;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Animal a1 = new Animal();
		Animal a2 = new Dog();
		Animal a3 = new Cat();
		Animal a4 = new Ferret();
		
		ArrayList<Animal> animals = new ArrayList<>();
		animals.add(a1);
		animals.add(a2);
		animals.add(a3);
		animals.add(a4);
		
		for (Animal a: animals) {
			System.out.println(a.speak());
		}

	}

}

package badidea3;

import java.util.Random;

public class Bad3 {

	public static void main(String[] args) {
		// common coupling
		
		Random r = new Random(12345);
		Car.speed = 10;
		for (int i = 0; i < 10; i++) {
			if (r.nextBoolean()) {
				Brakes.slow();
			} else {
				Engine.accelerate();
			}
			System.out.println(Car.speed);
		}

	}

}

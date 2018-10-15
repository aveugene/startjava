public class JaegerTest {
	public static void main(String[] args) {

		Jaeger jaegerCrimsonTyphoon = new Jaeger("Crimson Typhoon", "Mark-4", "China", 76.2f, 1722f, 9, 8, 6);

		Jaeger jaegerGipsyDanger = new Jaeger();
		jaegerGipsyDanger.setModelName("Gipsy Danger");
		jaegerGipsyDanger.setMark("Mark-3");
		jaegerGipsyDanger.setOrigin("USA");
		jaegerGipsyDanger.setHeight(79.25f);
		jaegerGipsyDanger.setWeight(1980f);
		jaegerGipsyDanger.setSpeed(7);
		jaegerGipsyDanger.setStrength(8);
		jaegerGipsyDanger.setArmor(6);

		System.out.println("Jaeger initialised:");
		System.out.println(jaegerCrimsonTyphoon.toString());
		
		System.out.println("Jaeger initialised:");
		System.out.println(jaegerGipsyDanger.toString());


		if (jaegerCrimsonTyphoon.drift()) {
			System.out.println(jaegerCrimsonTyphoon.getModelName() + " is ready to fight Kaiju!");
		}
		if (jaegerGipsyDanger.drift()) {
			System.out.println(jaegerGipsyDanger.getModelName() + " is ready to fight Kaiju!");
		}

		jaegerCrimsonTyphoon.move();
		System.out.println(jaegerGipsyDanger.scanKaiju());

		jaegerCrimsonTyphoon.usePlasmacaster();
		jaegerGipsyDanger.usePlasmacaster();

		System.out.println("\nCurrent speed of " + jaegerGipsyDanger.getModelName() + " is " + jaegerGipsyDanger.getSpeed() + "\nUpgrading speed...");
		jaegerGipsyDanger.setSpeed(jaegerGipsyDanger.getSpeed()+1);
		System.out.println("Speed upgraded to " + jaegerGipsyDanger.getSpeed());
	}
}
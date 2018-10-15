public class JaegerTest {
	public static void main(String[] args) {

		Jaeger jaeger1 = new Jaeger("Crimson Typhoon", "Mark-4", "China", 76.2f, 1722f, 9, 8, 6);

		Jaeger jaeger2 = new Jaeger();
		jaeger2.setModelName("Gipsy Danger");
		jaeger2.setMark("Mark-3");
		jaeger2.setOrigin("USA");
		jaeger2.setHeight(79.25f);
		jaeger2.setWeight(1980f);
		jaeger2.setSpeed(7);
		jaeger2.setStrength(8);
		jaeger2.setArmor(6);

		System.out.println("Jaeger initialised:");
		System.out.println("Model: " + jaeger1.getModelName() + "\nMark: " + jaeger1.getMark() + "\nOrigin: " + jaeger1.getOrigin() + "\nHeight: " + jaeger1.getHeight() + "\nWeight: " + jaeger1.getWeight() + "\nSpeed: " + jaeger1.getSpeed() + "\nStrength: " + jaeger1.getStrength() + "\nArmor: " + jaeger1.getArmor() + "\n");
		
		System.out.println("Jaeger initialised:");
		System.out.println("Model: " + jaeger2.getModelName() + "\nMark: " + jaeger2.getMark() + "\nOrigin: " + jaeger2.getOrigin() + "\nHeight: " + jaeger2.getHeight() + "\nWeight: " + jaeger2.getWeight() + "\nSpeed: " + jaeger2.getSpeed() + "\nStrength: " + jaeger2.getStrength() + "\nArmor: " + jaeger2.getArmor() + "\n");


		if (jaeger1.drift()) {
			System.out.println(jaeger1.getModelName() + " is ready to fight Kaiju!");
		}
		if (jaeger2.drift()) {
			System.out.println(jaeger2.getModelName() + " is ready to fight Kaiju!");
		}

		jaeger1.move();
		System.out.println(jaeger2.scanKaiju());

		jaeger1.usePlasmacaster();
		jaeger2.usePlasmacaster();

		System.out.println("\nCurrent speed of " + jaeger2.getModelName() + " is " + jaeger2.getSpeed() + "\nUpgrading speed...");
		jaeger2.setSpeed(jaeger2.getSpeed()+1);
		System.out.println("Speed upgraded to " + jaeger2.getSpeed());

	}
}
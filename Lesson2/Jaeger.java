public class Jaeger {

	private String modelName;
	private String mark;
	private String origin;
	private float height;
	private float weight;
	private int speed;
	private int strength;
	private int armor;

	public void setModelName(String modelName){
		if (modelName == ""){
			System.out.println("Model name must not be empty.");
		} else {
			this.modelName = modelName;
		}
	}
	public String getModelName(){
		return modelName;
	}

	public void setMark(String mark){
		if (mark == ""){
			System.out.println("Mark must not be empty.");
		} else {
			this.mark = mark;
		}
	}
	public String getMark(){
		return mark;
	}

	public void setOrigin(String origin){
		if (origin == ""){
			System.out.println("Origin must not be empty.");
		} else {
			this.origin = origin;
		}
	}
	public String getOrigin(){
		return origin;
	}

	public void setHeight(float height){
		if (height <= 0){
			System.out.println("Height must be greater than zero.");
		} else {
			this.height = height;
		}
	}
	public float getHeight(){
		return height;
	}

	public void setWeight(float weight){
		if (weight <= 0){
			System.out.println("Weight must be greater than zero.");
		} else {
			this.weight = weight;
		}
	}
	public float getWeight(){
		return weight;
	}

	public void setSpeed(int speed){
		if (speed < 1 || speed > 10){
			System.out.println("Speed must be from 1 to 10.");
		} else {
			this.speed = speed;
		}
	}
	public int getSpeed(){
		return speed;
	}

	public void setStrength(int strength){
		if (strength < 1 || strength > 10){
			System.out.println("Strength must be from 1 to 10.");
		} else {
			this.strength = strength;
		}
	}
	public int getStrength(){
		return strength;
	}

	public void setArmor(int armor){
		if (armor < 1 || armor > 10){
			System.out.println("Armor must be from 1 to 10.");
		} else {
			this.armor = armor;
		}
	}
	public int getArmor(){
		return armor;
	}

	boolean drift() {
		System.out.println(modelName + ": Drift initiated successfully.");
		return true;
	}

	void move() {
		System.out.println("Made one step.");
	}

	String scanKaiju() {
		return "Scanning for Kaiju... Clear.";
	}

	void usePlasmacaster(){
		System.out.println("Charging... Piu!");
	}
}
public class Jaeger {
	private String modelName;
	private String mark;
	private String origin;
	private float height;
	private float weight;
	private int speed;
	private int strength;
	private int armor;

	public Jaeger() {
	}

	public Jaeger(String modelName, String mark, String origin, float height, float weight, int speed, int strength, int armor) {
		this.modelName = modelName;
		this.mark = mark;
		this.origin = origin;
		this.height = height;
		this.weight = weight;
		this.speed = speed;
		this.strength = strength;
		this.armor = armor;
	}

	public void setModelName(String modelName) {
		if (modelName == "") {
			System.out.println("Model name must not be empty.");
		} else {
			this.modelName = modelName;
		}
	}

	public String getModelName() {
		return modelName;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getMark() {
		return mark;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getOrigin() {
		return origin;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getHeight() {
		return height;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public float getWeight() {
		return weight;
	}

	public void setSpeed(int speed) {
		if (speed < 1 || speed > 10) {
			System.out.println("Speed must be from 1 to 10.");
		} else {
			this.speed = speed;
		}
	}

	public int getSpeed() {
		return speed;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getStrength() {
		return strength;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}
	
	public int getArmor() {
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

	void usePlasmacaster() {
		System.out.println("Charging... Piu!");
	}

	public String toString() {
        return "Model: " + this.modelName + 
        		"\nMark: " + this.mark + 
        		"\nOrigin: " + this.origin + 
        		"\nHeight: " + this.height + 
        		"\nWeight: " + this.weight + 
        		"\nSpeed: " + this.speed + 
        		"\nStrength: " + this.strength + 
        		"\nArmor: " + this.armor + "\n";
    }
}
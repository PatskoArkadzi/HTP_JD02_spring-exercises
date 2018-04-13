package by.htp.spring.sample.entity;

public class Engine {
	private String power;

	public Engine() {
		super();
	}
	private static Engine getInstance() {
		System.out.println("in getInstance");
		return new Engine();
	}
	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}
	public void initEngine() {
		System.out.println("Init engine");
	}
	public void destroyEngine() {
		System.out.println("Destroy engine");
	}

}

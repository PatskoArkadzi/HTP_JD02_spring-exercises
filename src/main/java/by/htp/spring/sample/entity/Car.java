package by.htp.spring.sample.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Car {
	private String model;
	private Engine engine;
	private List<String> owners;
	private Set<Integer> vins;
	private Map<String, Integer> location;

	public Car() {
	}

	public Car(String model) {
		this.model = model;
	}

	public Car(String model, Engine enjine) {
		super();
		this.model = model;
		this.engine = enjine;
	}
	
	public Car(Map<String, Integer> location) {
		super();
		this.location = location;
	}

	public Car(Set<Integer> vins) {
		super();
		this.vins = vins;
	}

	public Car(List<String> owners) {
		super();
		this.owners = owners;
	}

	public Engine getEngine() {
		return engine;
	}

	public Set<Integer> getVins() {
		return vins;
	}

	public void setVins(Set<Integer> vins) {
		this.vins = vins;
	}

	public Map<String, Integer> getLocation() {
		return location;
	}

	public void setLocation(Map<String, Integer> location) {
		this.location = location;
	}

	public List<String> getOwners() {
		return owners;
	}

	public void setOwners(List<String> owners) {
		this.owners = owners;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void init() {
		System.out.println("Init car");
	}

	public void destroy() {
		System.out.println("Destroy car");
	}

}

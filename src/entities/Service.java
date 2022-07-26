package entities;

import java.util.ArrayList;
import java.util.List;

public class Service {
	private int id;
	private String name;
	private final List<Package> packages = new ArrayList<>();
	private final List<Product> products = new ArrayList<>();



	public Service(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Package> getPackages() {
		return packages;
	}
	public List<Product> getProducts() {
		return products;
	}
}

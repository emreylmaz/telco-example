package entities;

import java.util.ArrayList;
import java.util.List;

public abstract class Customer {
	private int id;
	private String customerNumber;
	private final List<Subscription> subscriptions = new ArrayList<>();
	
	public Customer(int id, String customerNumber) {
		super();
		this.id = id;
		this.customerNumber = customerNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	public List<Subscription> getSubscriptions() {
		return subscriptions;
	}
	
	
}

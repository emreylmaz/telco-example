package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Subscription {
	private int id;
	private Customer customer;
	private LocalDate dateStarted;
	private Package packages;
	private final List<Invoice> invoices = new ArrayList<>();
	private LocalDate endDate;
	private Address address;

	public Subscription(int id, Customer customer, LocalDate dateStarted, Package packages, LocalDate endDate, Address address) {
		this.id = id;
		this.customer = customer;
		this.dateStarted = dateStarted;
		this.packages = packages;
		this.endDate = endDate;
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public LocalDate getDateStarted() {
		return dateStarted;
	}

	public void setDateStarted(LocalDate dateStarted) {
		this.dateStarted = dateStarted;
	}

	public Package getPackages() {
		return packages;
	}

	public void setPackages(Package packages) {
		this.packages = packages;
	}

	public List<Invoice> getInvoices() {
		return invoices;
	}
	
}

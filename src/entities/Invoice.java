package entities;

import java.time.LocalDate;

public class Invoice {
	private int id;
	private Subscription subscription;
	private LocalDate dateCreated, dueDate;
	private boolean isPaid; // TODO: sonra bakalım sevgili pair 3



	public Invoice(int id, Subscription subscription, LocalDate dateCreated, LocalDate dueDate, boolean isPaid) {
		super();
		this.id = id;
		this.subscription = subscription;
		this.dateCreated = dateCreated;
		this.dueDate = dueDate;
		this.isPaid = isPaid;
	}
	public boolean isPaid() {
		return isPaid;
	}

	public void setPaid(boolean paid) {
		isPaid = paid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Subscription getSubscription() {
		return subscription;
	}

	public void setSubscription(Subscription subscription) {
		this.subscription = subscription;
	}

	public LocalDate getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(LocalDate dateCreated) {
		this.dateCreated = dateCreated;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
	
}

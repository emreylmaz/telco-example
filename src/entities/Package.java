package entities;

import java.util.ArrayList;
import java.util.List;

public class Package {
    private int id;
    private String name;
    private Service service;
    private double price;
    private  final List<Subscription> subscriptions = new ArrayList<>();



    public Package(int id, String name, Service service, double price) {
        this.id = id;
        this.name = name;
        this.service = service;
        this.price = price;
    }
    public List<Subscription> getSubscriptions() {
        return subscriptions;
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

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

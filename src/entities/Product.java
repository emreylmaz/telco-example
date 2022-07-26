package entities;

public abstract class Product {
    private int id;
    private Service service;

    public Product(int id, Service service) {
        this.id = id;
        this.service = service;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }
}

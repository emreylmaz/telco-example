package entities;

public class Modem extends Product{
    private String serialNumber;
    private String brand;
    private  String model;
    private Cable cable;

    public Modem(int id, Service service, String serialNumber, String brand, String model, Cable cable) {
        super(id, service);
        this.serialNumber = serialNumber;
        this.brand = brand;
        this.model = model;
        this.cable = cable;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Cable getCable() {
        return cable;
    }

    public void setCable(Cable cable) {
        this.cable = cable;
    }
}

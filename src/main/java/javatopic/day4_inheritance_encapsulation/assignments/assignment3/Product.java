package javatopic.day4_inheritance_encapsulation.assignments.assignment3;

public class Product {
    
    // data member
    private String name;
    private String id;
    private String manufacturer;
    private Double price;


    // constructor
    public Product() {

    }


    public Product(String name, String id, String manufacturer,Double price) {
        this.name = name;
        this.id = id;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    // method

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    //template to print the obj in string formate
    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                '}';
    }
}

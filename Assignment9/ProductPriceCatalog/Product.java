package Assignment9.ProductPriceCatalog;

import java.util.Objects;

public class Product {
    private int productId;
    private String name;
    private double price;

    public Product() {}

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || o.getClass() != Product.class) return false;
        Product p = (Product) o;
        return this.productId == p.productId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId);
    }
}


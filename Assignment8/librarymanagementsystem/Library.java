package Assignment8.librarymanagementsystem;

public class Library implements Comparable<Library> {
    private Integer id;
    private String title;
    private String author;
    private double price;
    public Library()
    {
    }
    public Library(Integer id, String title, String author, double price)
    {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + title + '\'' +
                ", author=" + author +
                ", Price=" + price + '\'' +
                '}';
    }

    @Override
    public int compareTo(Library o) {
        return this.getTitle().compareTo(o.getTitle());
    }
}

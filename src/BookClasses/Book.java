package BookClasses;

import java.util.Objects;

public class Book {
    private int id;
    private String author;
    private String name;
    private double price;
    private boolean isAvailable;
    private String edition;
    private String category;
    private String title;

    public Book(int id, String author, String name, double price, boolean isAvailable, String edition, String category, String title) {
        this.id = id;
        this.author = author;
        this.name = name;
        this.price = price;
        this.isAvailable = isAvailable;
        this.edition = edition;
        this.category = category;
        this.title=title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "BookClasses.Book{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", isAvailable=" + isAvailable +
                ", edition='" + edition + '\'' +
                ", category='" + category + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Book book = (Book) object;
        return id == book.id && Double.compare(price, book.price) == 0 && isAvailable == book.isAvailable && Objects.equals(author, book.author) && Objects.equals(name, book.name) && Objects.equals(edition, book.edition) && Objects.equals(category, book.category) && Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, author, name, price, isAvailable, edition, category, title);
    }
}

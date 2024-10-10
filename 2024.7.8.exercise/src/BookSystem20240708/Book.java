package BookSystem20240708;

public class Book {
    private String name;
    private String number;
    private String writer;
    private String price;

    public Book() {}

    public Book(String name, String number, String writer, String price) {
        this.name = name;
        this.number = number;
        this.writer = writer;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}

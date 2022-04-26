public class BookSecond {

    private String isbn;
    private String name;
    private AuthorSecond author;
    private double price;
    private int qty;

    public BookSecond(String isbn, String name, AuthorSecond author, double price, int i){
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getName() {
        return name;
    }

    public AuthorSecond getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getAuthorName(){
        return author.getName();
    }

    public String toString(){
        return "Book[isbn=" + name + ",name=" + name + "," + author.toString() + ",price=" + price + ",qty=" + qty + "]";
    }
}

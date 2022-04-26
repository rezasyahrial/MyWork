public class BookArray {

    private final String name;
    private final Author[] authors;
    private double price;
    private int qty;
    private String comma;

    public BookArray(String name, Author[] authors, double price){
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public BookArray(String name, Author[] authors, double price, int qty){
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
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

    public void printAuthors(){
        for (int i = 0; i <this.getAuthors().length-1; ++i){
            if(this.getAuthors()[i] != null){
                System.out.println(this.getAuthors()[i]);
                if (this.getAuthors()[i + 1] != null){
                    comma();
                }
            } else {
                System.out.println("");
            }
        }
        if( this.getAuthors()[this.getAuthors().length-1]) != null){
            System.out.println(this.getAuthors()[this.getAuthors().length-1]);
        } else {
            System.out.println("");
        }
    }

    private void comma() {

    }

}

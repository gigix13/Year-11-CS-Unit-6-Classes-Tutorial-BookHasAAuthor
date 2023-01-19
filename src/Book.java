public class Book {
    public String name;
    public Author author;
    public Double price;
    public int qty;
    public Book(String n, Author author, double p, int qty){
        name = n;
        this.author = author;
        price = p;
        this.qty = qty;
    }

    public String getName(){
        return name;
    }

    public Author getAuthor(){
        return author;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public int getQty(){
        return qty;
    }

    public void setQty(int qty){
        this.qty = qty;
    }

    public String toString(){
        return "'" + name + "' by " + author.toString();
    }
}

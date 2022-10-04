package labsheet4.exercise5;

public class Book {
    private String title;
    private double price;
    private String ISBN;
    private int pages;

    public Book(){
        title = "Not Available";
        price = 0.0;
        ISBN = "Not Available";
        pages = 0;
    }

    public Book(String title, double price,String ISBN,int pages){
        this.title=title;
        this.price = price;
        this.ISBN = ISBN;
        this.pages = pages;
    }
    public String getTitle(){
        return title;
    }
    public double getPrice(){
        return price;
    }
    public String getISBN(){
        return ISBN;
    }
    public int getPages(){return pages;}

    public void setTitle(String title) {
        if(title.equals("") && title.equals(null)){
            this.title = "No Valid Title Supplied";
        }
        else {
            this.title = title;
        }
    }

    public void setPrice(double price) {
        if(price > 0 && price <= 5000){
            this.price = price;
        }
        else{
            this.price = 0;
        }

    }

    public void setISBN(String ISBN) {
        if(ISBN.equals("") && ISBN.equals(null)){
            this.ISBN = "No Valid ISBN Supplied";
        }
        else {
            this.ISBN = ISBN;
        }
    }

    public void setPages(int pages) {
        if(pages > 0 && pages <= 5000){
            this.pages = pages;
        }
        else{
            this.pages = 0;
        }
    }
    public String toString(){
        return "Title: " + getTitle() + "  Price: "+ getPrice() + "  ISBN: " + getISBN()+ "  Number of Pages: " + getPages();
    }
}

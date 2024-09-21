public class Book {
    public String title;
    public String author;
    public String ISBN;
    public int price;


    public void displayInfo(){
        System.out.println("Book title:" + title);
        System.out.println("Book author:" + author);
        System.out.println("Book ISBN:" + ISBN);
        System.out.println("Book price:" + price);
    }

    public Book(String title, String author, String ISBN, int price){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.price = price;
    }

    public void SherlockFind(String s_title){
        if(s_title == "The adventures of Sherlock Holmes"){
            this.price = 0;
        }
    }
}


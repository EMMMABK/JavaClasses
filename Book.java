public class Book {
    private String title;
    private String author;
    private String ISBN;
    private int price;


    public void displayInfo(){
        System.out.println("Book title:" + title);
        System.out.println("Book author:" + author);
        System.out.println("Book ISBN:" + ISBN);
        System.out.println("Book price:" + price);
    }

    // this is parameterized constructor
    public Book(String title, String author, String ISBN, int price){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.price = price;
    }
    

    // This is default constructructor
    public Book() {
        this.title = "";
        this.author = "";
        this.ISBN = "";
        this.price = 0;
    }


    // this is an additional method
    public void SherlockFind(String s_title){
        if(s_title == "The adventures of Sherlock Holmes"){
            System.out.println("I like this book that's why your book information will edit.");
            this.price = 0;
        }else{
            System.out.println("Oh, ok.");
        }
    }
}


public class Main {
    public static void main(String []args){
        Book b1 = new Book("The adventures of Sherlock Holmes", " Sir Arthur Conan Doyle", " 978-5-17-122005-1", 500);
        b1.displayInfo();
        System.out.println("So, if you like this book, price will be:");
        b1.SherlockFind(b1.title);
        b1.displayInfo();
    }
}   

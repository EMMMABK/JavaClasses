public class Main {
    public static void main(String []args){
        Book b1 = new Book();
        b1.title = "The adventures of Sherlock Holmes";
        b1.author = "Sir Arthur Conan Doyle";
        b1.ISBN = "978-5-17-122005-1";
        b1.price = 500;

        System.out.println(b1.title);
        System.out.println(b1.author);
        System.out.println(b1.ISBN);
        System.out.println(b1.price);
    }
}   

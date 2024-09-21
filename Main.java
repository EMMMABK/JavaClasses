public class Main {
    public static void main(String []args){
        Book b1 = new Book("The adventures of Sherlock Holmes", " Sir Arthur Conan Doyle", " 978-5-17-122005-1", 500);
        Book b2 = new Book("John with Dog", "OOP HW", "32-42342-347545-23", 40);
        Book b3 = new Book("Jogn with cat", "OOP HW", "74684564-56u459684056-456", 10);
        System.out.println("1:");
        b1.displayInfo();
        b1.SherlockFind(b1.title);
        b1.displayInfo();

        System.out.println("2:");
        b2.displayInfo();
        b2.SherlockFind(b2.title);
        b2.displayInfo();

        System.out.println("3:");
        b3.displayInfo();
        b3.SherlockFind(b3.title);
        b3.displayInfo();
    }
}   

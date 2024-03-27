class library{

    String[] books;
    int no_of_books = 0;

    library(){
        this.books = new String[100];
        this.no_of_books = 0;

    }

    void addbook(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println("book has been added");
    }

    void showAvailableBooks(){
        System.out.println("Available books are: ");
        for(String book : this.books){
            if(book==null){
                break;
            }
            System.out.println("* "+book);
        }
    }
}


public class online_library {
    public static void main(String[] args) {
        
        online_library centLibrary = new online_library();
        centLibrary.addbook("think and grow");
        centLibrary.addbook("algorithm");
        centLibrary.addbook("C++");
        centLibrary.showAvailableBooks();
    }
}

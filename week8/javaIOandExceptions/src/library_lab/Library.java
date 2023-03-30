package library_lab;

import java.util.ArrayList;
import java.util.List;

public class Library {
	
	static int OPENING_TIME = 9;
	static int CLOSING_TIME = 5;
    // Add the missing implementation to this class
	String address;
	List<Book> books = new ArrayList<>();

    public Library(String address) {
		// TODO Auto-generated constructor stub
    	this.address = address;
	}
    
    private void addBook(Book book) {
		this.books.add(book);
	}
    
    private static void printOpeningHours() {
    	System.out.print("Libraries are open daily from " + OPENING_TIME + "am to " + CLOSING_TIME + "pm.");
    }
    
    private void printAddress() {
    	// TODO Auto-generated method stub
    	System.out.println(address);
    }
    
    private void borrowBook(String bookName) {
    	boolean found = false;
    	for (int i = 0; i < books.size(); i++) {
    		if (books.get(i).title.equals(bookName)) {
    			Book book = this.books.get(i);
    	    	if (!book.isBorrowed()) {
    	    		book.rented();
    	    		System.out.println("You successfully borrowed " + bookName);
    	    	}
    	    	else {
    	    		System.out.println("Sorry, this book is already borrowed.");
    	    	}
    	    	found = true;
    			break;
    		}
    	}
    	if (!found) {
    		System.out.println("Sorry, this book is not in our catalog.");
    	}
    }
    
    private void returnBook(String bookName) {
    	for (int i = 0; i < books.size(); i++) {
    		if (books.get(i).title.equals(bookName)) {
    			Book book = this.books.get(i);
    	    	if (book.isBorrowed()) {
    	    		book.returned();
    	    		System.out.println("You successfully returned " + bookName);
    	    	}
    			break;
    		}
    	}
    }
    
    private void printAvailableBooks() {
    	if (!books.isEmpty()) {
    		for (Book book : this.books) {
    			if (!book.isBorrowed()) {
    				System.out.println(book.getTitle());
    			}
    		}
    	}
    	else {
    		System.out.println("No book in catalog");
    	}
    }
    
	public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }





}
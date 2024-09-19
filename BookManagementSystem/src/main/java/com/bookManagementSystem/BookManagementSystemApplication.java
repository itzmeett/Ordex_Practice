package com.bookManagementSystem;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bookManagementSystem.booksEntity.Books;
import com.bookManagementSystem.booksSevice.BookService;

@SpringBootApplication(scanBasePackages = "com.bookManagementSystem")
public class BookManagementSystemApplication implements CommandLineRunner {

	@Autowired
	BookService bookService;

	public static void main(String[] args) {
		SpringApplication.run(BookManagementSystemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		boolean running = true;
		Scanner scanner = new Scanner(System.in);

		while (running) {
			System.out.println("Press 1 for add a new book.");
			System.out.println("Press 2 for get a single book.");
			System.out.println("Press 3 for get all books.");
			System.out.println("Press 4 for update a book.");
			System.out.println("Press 5 for delete a book.");
			System.out.println("Press 6 for Exit.");

			System.out.println("\nEnter Your Choice : ");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				addingBookById(scanner);
				break;

			case 2:
				getSingleBook(scanner);
				break;

			case 3:
				showAllBooks(scanner);
				break;

			case 4:
				updateBookDetails(scanner);
				break;

			case 5:
				System.out.println("Case v5");
				break;

			case 6:
				running = false;
				System.out.println("Thank you for using our application");
				break;

			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
		}
	}

	// take the data for add a book
	public void addingBookById(Scanner scanner) {
		System.out.println("\nEnter Book Title :");
		scanner.nextLine();
		String title = scanner.nextLine();
		
		System.out.println("\nEnter Book Price :");
		Float price = scanner.nextFloat();
		scanner.nextLine();
		
		System.out.println("\nEnter Book Author :");
		String author = scanner.nextLine();

		try {
			bookService.addBook(title, author, price);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	// take id for get a single book
	public void getSingleBook(Scanner scanner) {
		System.out.println("\nEnter Book's Id for its Details : ");
		int id = scanner.nextInt();

		try {
			Books singleBook = bookService.showBookById(id);
			System.out.println("\n================Details of Book================\n");
			System.out.println("\nTitle : " + singleBook.getTitle() + "\nAuthor : " + singleBook.getAuthor()
					+ "\nPrice : " + singleBook.getPrice() + "\n");
			System.out.println("\n===============================================\n");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	// Listed all books
	public void showAllBooks(Scanner scanner) {
		System.out.println("================All Books are Listed Below================");
		List<Books> allBooks = bookService.getAllBooks();
		for (Books listOfBook : allBooks) {
			System.out.println("\nTitle : " + listOfBook.getTitle() + "\nAuthor : " + listOfBook.getAuthor()
					+ "\nPrice : " + listOfBook.getPrice() + "\n");
			System.out.println("----------------------------------");
		}
		System.out.println("\n==================================================================\n");
	}

	// Update a Book Detail
	public void updateBookDetails(Scanner scanner) {
		try {
			System.out.println("Enter Book's Id for update details :");
			int updateID = scanner.nextInt();

			System.out.println("Enter Updated Title : ");
			String updateTitle = scanner.nextLine();
			scanner.nextLine();
			
			System.out.println("Enter Updated Author : ");
			String updateAuthor = scanner.nextLine();
			scanner.nextLine();
			
			System.out.println("Enter Updated Price: ");
			Float updatePrice = scanner.nextFloat();

			bookService.updateBook(updateID, updateTitle, updateAuthor, updatePrice);

		}catch(IllegalArgumentException e){
			System.out.println("Illegal Arguments : "+e.getMessage());
		}
		catch (Exception e) {
			System.out.println("Error : "+e.getMessage());
		}
	}

}

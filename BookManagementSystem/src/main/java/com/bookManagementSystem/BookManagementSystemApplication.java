package com.bookManagementSystem;

import java.util.InputMismatchException;
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
//			try {
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
				deletingBook(scanner);
				break;

			case 6:
				running = false;
				System.out
						.println("\n**********************Thank you for using our application**********************\n");
				break;

			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
		}
//			catch (IllegalArgumentException e) {
//				System.out.println("\n++++++++++++++++++Illegal Argument : " + e.getMessage()+"++++++++++++++++++\n");
//			}

	}
//	}

	// Adding a new book
	public void addingBookById(Scanner scanner) {
		try {
			System.out.println("\nEnter Book Title :");
			scanner.nextLine();
			String title = scanner.nextLine();

			System.out.println("\nEnter Book Price :");
			if (!scanner.hasNextFloat()) {
				throw new InputMismatchException("Invalid price input. Please enter a valid number.");
			}
			float price = scanner.nextFloat();
			scanner.nextLine();

			System.out.println("\nEnter Book Author :");
			String author = scanner.nextLine();

			bookService.addBook(title, author, price);

		} catch (InputMismatchException e) {
			System.out.println("\n++++++++++++++ Error: Invalid input type! " + e.getMessage() + " ++++++++++++++");
			scanner.nextLine();
		} catch (IllegalArgumentException e) {
			System.out.println("\n++++++++++++++ Error: " + e.getMessage() + " ++++++++++++++");
		} catch (Exception e) {
			System.out.println(
					"\n++++++++++++++ Error: An unexpected error occurred. " + e.getMessage() + " ++++++++++++++");
		}
	}

	// Get get a single book with id
	public void getSingleBook(Scanner scanner) {
		System.out.println("\nEnter Book's Id for its Details : ");
		int id = scanner.nextInt();

		try {
			Books singleBook = bookService.showBookById(id);
			System.out.println("\n================Details of Book================\n");
			System.out.println("\nTitle : " + singleBook.getTitle() + "\nAuthor : " + singleBook.getAuthor()
					+ "\nPrice : " + singleBook.getPrice() + "\n");
			System.out.println("\n===============================================\n");

		} catch (InputMismatchException e) {
			System.out.println("Input should be a between 1 to 6 : " + e.getMessage());

		} catch (IllegalArgumentException e) {
			System.out.println("Illegal argument : " + e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	// Listed all books
	public void showAllBooks(Scanner scanner) {
		System.out.println("================All Books are Listed Below================");
		List<Books> allBooks = bookService.getAllBooks();
		for (Books listOfBook : allBooks) {
			System.out.println("----------------------------------");
			System.out.println("\nId :" + listOfBook.getBid() + "\nTitle : " + listOfBook.getTitle() + "\nAuthor : "
					+ listOfBook.getAuthor() + "\nPrice : " + listOfBook.getPrice() + "\n");
		}
		System.out.println("\n==================================================================\n");
	}

	// Update a Book Detail
	public void updateBookDetails(Scanner scanner) {
		try {
			System.out.println("Enter Book's Id for update details:");
			int updateID = scanner.nextInt();
			scanner.nextLine();

			System.out.println("Enter Updated Title:");
			String updateTitle = scanner.nextLine();

			System.out.println("Enter Updated Author:");
			String updateAuthor = scanner.nextLine();

			System.out.println("Enter Updated Price:");
			float updatePrice = scanner.nextFloat();

			bookService.updateBook(updateID, updateTitle, updateAuthor, updatePrice);

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	// Deleting a Book
	public void deletingBook(Scanner scanner) {
		try {
			System.out.println("Enter Book's Id for delete a book : ");
			int deleteId = scanner.nextInt();

			bookService.deleteBook(deleteId);

		} catch (Exception e) {
			System.out.println("++++++++++++++++++++Error : " + e.getMessage() + "++++++++++++++++++++");
		}
	}

}

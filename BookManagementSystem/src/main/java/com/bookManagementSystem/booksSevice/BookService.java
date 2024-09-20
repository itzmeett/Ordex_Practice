package com.bookManagementSystem.booksSevice;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookManagementSystem.booksController.BooksRepository;
import com.bookManagementSystem.booksEntity.Books;

@Service
public class BookService {

	@Autowired
	private BooksRepository service;
	
	// Adding a book
	public void addBook(String title, String author, float price) {
		Books book = new Books(title, author, price);
		book.setAuthor(author);
		book.setTitle(title);
		book.setPrice(price);
		service.save(book);
		System.out.println("+++++++++++++++++++++++Book added successfully+++++++++++++++++++++++");
	}

	// Getting a single book by it's id
	public Books showBookById(Integer id) {
		if (id == null || id <= 0) {
			throw new IllegalArgumentException("+++++++++++++++++++++++Invalid Id !!+++++++++++++++++++++++");
		} else {
			Optional<Books> singleBook = service.findById(id);
			return singleBook.orElseThrow(() -> new InputMismatchException("+++++++++++++++++++++++Book with id " + id + " does not exist+++++++++++++++++++++++"));
		}
	}
	
	// Getting all books
	public List<Books> getAllBooks(){
		return service.findAll();
	}
	
	// Updating a Book
	 public void updateBook(Integer updateId, String title, String author, float price) {
	        Optional<Books> getBook = service.findById(updateId);
	        if (getBook.isPresent()) {
	            Books updatedBook = getBook.get();
	            updatedBook.setTitle(title);
	            updatedBook.setAuthor(author);
	            updatedBook.setPrice(price);
	            service.save(updatedBook);
	            System.out.println("+++++++++++++++++++++++Book with id " + updateId + " is updated+++++++++++++++++++++++");
	        } else {
	            System.out.println("+++++++++++++++++++++++Book with id " + updateId + " is not found+++++++++++++++++++++++");
	        }
	    }
	
	// Deleting a Book
	public void deleteBook(Integer id) {
		Optional<Books> getBookToDelete = service.findById(id);
		if(getBookToDelete.get().getBid() == id) {
			service.deleteById(id);
			System.out.println("+++++++++++++++++++++++Book with id "+ id +" is successfull deleted.+++++++++++++++++++++++");
		}
		else {
			System.out.println("+++++++++++++++++++++++Book with id "+ id +" is not exist.+++++++++++++++++++++++");
		}
	}
}

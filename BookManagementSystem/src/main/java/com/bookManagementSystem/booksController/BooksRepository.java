package com.bookManagementSystem.booksController;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

import com.bookManagementSystem.booksEntity.Books;

public interface BooksRepository extends JpaRepository<Books,Integer> {
	
	
}

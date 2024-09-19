package com.bookManagementSystem.booksEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Books {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer bid;
	@Column(name="Book_Title")
	private String title;
	@Column(name="Book_Author")
	private String author;
	@Column(name="Book_Price")
	private float price;

	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Books(String title, String author, float price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Books [bid=" + bid + ", title=" + title + ", author=" + author + ", price=" + price + "]";
	}

}

package com.training.services;

import java.util.List;
import java.util.function.Predicate;
import java.util.ArrayList;
import com.training.ifaces.CrudRepository;
import com.training.model.Book;

public class BookService implements CrudRepository {

	private ArrayList<Book> bookList;
	
	
	public BookService() {
		super();
		this.bookList=new ArrayList<>();
	}

	@Override
	public boolean add(Book book) {
		
		//boolean result = bookList.add(book);
		
		//return result;
		
		return bookList.add(book);
	}

	@Override
	public Book findByBookId(int id) {
		Book found = null;
		for(Book eachBook : this.bookList) {
			if(id == eachBook.getBookNumber()) {
				found=eachBook;
			}
		}
		return found;
	}

	@Override
	public boolean remove(Book book) {
		
		return this.bookList.remove(book);
	}

	@Override
	public List<Book> findAll() {
		return this.bookList;
	}

	@Override
	public Book update(Book oldbook, Book newBook) {
		
		if(this.bookList.contains(oldbook)) {
			int idxPos = this.bookList.indexOf(oldbook);
			this.bookList.set(idxPos, newBook);
		}else {
			System.out.println("Inside Else Bock ######");
			add(oldbook);
		}
		return newBook;
	}

	@Override
	public Book update(Book book) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<Book> getBooksGrtThan(double price){
		
		//write using predicate and forEach
		
		List<Book> grtThanList = new ArrayList<Book>();
		
		Predicate<Double> grtThan = (value) -> value > 300.00;
		
		this.bookList.forEach(book ->
		{
			double bookPrice = book.getPrice();
			if(grtThan.test(bookPrice)) {
			grtThanList.add(book);	
			}
		});
		
		return grtThanList;
	}

}

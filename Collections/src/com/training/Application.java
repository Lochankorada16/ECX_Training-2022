package com.training;

import java.util.List;

import com.training.ifaces.CrudRepository;
import com.training.model.Book;
import com.training.services.BookService;

public class Application {

	public static void print(List<Book> books) {
		for (Book eachBook : books) {
			System.out.println(eachBook);
		}
	}
	public static void main(String[] args) {
		

		Book java = new Book(101,"Java","suba", 250);
		Book spring = new Book(102,"Spring","Mad", 650);
		Book maven = new Book(103,"Maven","Harish", 550);
		Book html = new Book(104,"Html","Priya", 1450);
		Book python = new Book(105,"Python","Sathya", 850);
		
		CrudRepository service = new BookService();
		
		System.out.println(service.add(java));
		service.add(spring);
		service.add(maven);
		service.add(html);
		service.add(python);
		
		print(service.findAll());
		
//		List<Book> bookList = service.findAll();
		
//		for (Book eachBook : bookList) {
//			System.out.println(eachBook);
//		}
		
		Book foundBook = service.findByBookId(104);
		System.out.println("\nBook by id");
		System.out.println("Found Book ="+ foundBook);
		
//		service.remove(python);
//		service.remove(html);
		System.out.println("=================");
		
//		List<Book> secondList=service.findAll();
		
//		for (Book eachBook : secondList) {
//			System.out.println(eachBook);
//		}
		
		print(service.findAll());
		
		Book react = new Book(205, "ReactJS", "Rahul", 6850);
		
		service.update(react);
		
		print(service.findAll());
		
		System.out.println();
		
		List<Book> bookList = ((BookService)service).getBooksGrtThan(400);
		
		bookList.forEach(System.out::println);
		
	}		

}

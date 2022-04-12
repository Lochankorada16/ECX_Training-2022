package com.training;

import java.util.*;

import com.training.ifaces.CrudRepository;
import com.training.model.Book;
import com.training.services.BookService;
import com.training.utils.BookNameComparator;
public class App {
	
	public static void print(List<Book> books) {
		for (Book eachBook : books) {
			System.out.println(eachBook);
		}
	}

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();
		
		names.add("Ramesh");
		names.add("Anand");
		names.add("Chandru");
		names.add("Zahir");
		names.add("Pavan");
		
		Collections.sort(names);
		
		System.out.println(names);
		
		Book java = new Book(101,"Java","suba", 450);
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
		
		List <Book> bookList = service.findAll();
		
		Collections.sort(bookList);
		
		System.out.println(bookList);
		
		Collections.sort(bookList, new BookNameComparator());
		
		System.out.println("Sort by Book Name");
		
		print(bookList);
	}

}

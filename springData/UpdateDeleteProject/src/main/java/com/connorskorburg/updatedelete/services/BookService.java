package com.connorskorburg.updatedelete.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.connorskorburg.updatedelete.models.Book;
import com.connorskorburg.updatedelete.repositories.BookRepository;

@Service
public class BookService {
	private final BookRepository bookRepository;
	
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	//returns all the books
	public List<Book> allBooks(){
		return bookRepository.findAll();
	}
	//creates a book
	public Book createBook(Book b) {
		return bookRepository.save(b);
	}
	//retrieves a book
	public Book findBook(Long id) {
		Optional<Book> optionalBook = bookRepository.findById(id);
		if(optionalBook.isPresent()) {
			return optionalBook.get();
		} else {
			return null;
		}
	}
	//saves the update
	public Book updateBook(Book b) {
		return bookRepository.save(b);
	}
	//updates a book
	public Book updateBook(Long id, String title, String desc, String lang, Integer numOfPages) {
		Optional<Book> b = bookRepository.findById(id);
		if(b.isPresent()) {
			b.get().setTitle(title);
			b.get().setDescription(desc);
			b.get().setLanguage(lang);
			b.get().setNumberOfPages(numOfPages);
			
			return b.get();
		} else {
			return null;
		}
	}
	//deletes a book
	public void deleteBook(Long id) {
		bookRepository.deleteById(id);
	}
}

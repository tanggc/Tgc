package com.cn.tgc.controller;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cn.tgc.pojo.Book;
import com.cn.tgc.service.impl.BookService;

@Controller
@RequestMapping("/book")
public class BookController {
	@Resource(name="bookService")
	private BookService bookService;
	Logger log = LoggerFactory.getLogger(BookController.class);
	
	@RequestMapping(value="/detail/{bookId}",method = RequestMethod.GET)
	public String getBookById(@PathVariable("bookId") String bookId ,ModelMap model){
		String message = "this is books:";
		Book book = getBookService().getBookById(bookId);
		log.debug("book:{}",book);
		
		model.put("message", message);
		model.put("book", book);
		
		return "detail";
	}
	
	@RequestMapping(value="/all",method = RequestMethod.GET)
	public String getBooks(ModelMap model){
		List<Book> bookList = getBookService().getAll();
		log.info("bookList:{}",bookList);
		String message = "this is all of books:";
		model.put("message", message);
		model.put("bookList", bookList);
		return "all";
	}
	
	public BookService getBookService() {
		return bookService;
	}
	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}
	
	
}

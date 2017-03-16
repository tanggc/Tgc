package com.cn.tgc.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.tgc.dao.BookDao;
import com.cn.tgc.pojo.Book;

@Service("bookService")
public class BookService {
	@Resource(name = "bookDao")
	private BookDao bookDao;
	
	public Book getBookById(String id){
		Book book = getBookDao().getBook(id);
		return book;
	}
	
	public List<Book> getAll(){
		return getBookDao().getAll();
	}
	public BookDao getBookDao() {
		return bookDao;
	}
	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}
	
}

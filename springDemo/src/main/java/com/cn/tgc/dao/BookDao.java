package com.cn.tgc.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cn.tgc.pojo.Book;

@Repository(value="bookDao")
public class BookDao {
	
	public Book getBook(String id){
		Book book3 = null;
		Book book = new Book();
		book.setId(123);
		book.setName("qwerty");
		book.setAuthor("tgc");
		
		Book book2 = new Book();
		book2.setId(124);
		book2.setName("xxcc");
		book2.setAuthor("miles");
		
		if(id.equals(String.valueOf(book.getId()))){
			book3 = book;
		}else if(id.equals(String.valueOf(book2.getId()))){
			book3 = book2;
		}
		return book3;
	}
	
	public List<Book> getAll(){
		List<Book> list = new ArrayList<Book>();
		Book book = new Book();
		book.setId(123);
		book.setName("qwerty");
		book.setAuthor("tgc");
		
		Book book2 = new Book();
		book2.setId(124);
		book2.setName("xxcc");
		book2.setAuthor("miles");
		list.add(book);
		list.add(book2);
		return list;
		
	}
}

package com.wyfdc.go.designPattern.observerPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:  
 */
public class Library extends Observable{

  private List<Book> books = new ArrayList<>();

  public Library(List<Book> books) {
    this.books = books;
  }

  public Library() {
    Book book1 = new Book("西游记","吴承恩");
    Book book2 = new Book("水浒传","施耐庵");
    books.add(book1);
    books.add(book2);
  }

  public void addBook(Book book){
    books.add(book);
    super.notifyAllOberver(book);
  }

  public void delBook(Book book){
    books.remove(book);
  }

  public List<Book> getBooks() {
    return books;
  }

  public void setBooks(List<Book> books) {
    this.books = books;
  }
}

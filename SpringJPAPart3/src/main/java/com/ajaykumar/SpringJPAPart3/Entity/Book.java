//
//Ques 5:Create an Entity book with an instance variable bookName.

package com.ajaykumar.SpringJPAPart3.Entity;

import javax.persistence.*;
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookid;
    private String bookName;
   public  Book(){

   }

   @OneToOne(cascade = CascadeType.ALL)
   @JoinColumn(name = "author_id")
   private Author author;

    public Book(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}

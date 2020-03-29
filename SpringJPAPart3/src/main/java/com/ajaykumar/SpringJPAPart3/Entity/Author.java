package com.ajaykumar.SpringJPAPart3.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int authorId;
    private String authorName;

    //Ques 2:Create instance variable of AddressM2M class inside Author class and save it as embedded object.
    @Embedded
    Address address;

    //Ques 3:Introduce a List of subjects for author.
    @OneToMany(mappedBy = "author",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    List<Subject> subjectList;

    //Qus6. Implement One to One mapping between Author and Book.
    @OneToOne(mappedBy = "author",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Book book;



   public  Author(){

   }

    //Better way to handle Foreign Key
    public void addSubject(Subject subject){
        if (subject != null){
            if (subjectList == null){
                subjectList = new ArrayList<Subject>();
            }
            subject.setAuthor(this);
            subjectList.add(subject);
        }
    }
    public void addBook(Book book){
        if (book != null){
            book.setAuthor(this);
            this.setBook(book);
        }
    }


    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

//    public List<Book> getBookList() {
//        return bookList;
//    }
//
//    public void setBookList(List<Book> bookList) {
//        this.bookList = bookList;
//    }

    public List<Subject> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(List<Subject> subjectList) {
        this.subjectList = subjectList;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


}


package com.ajaykumar.SpringJPAPart3.OneToManyAssosiation;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "AuthorOneToMany")
public class AuthorO2M {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int authorId;
    private String authorName;


    @Embedded
    AddressO2M addressO2M;
    //Ques7.
    @OneToMany(mappedBy = "authorO2M",cascade = CascadeType.ALL)
    List<BookO2M> bookList;


   public AuthorO2M(){

   }

    //Better way to handle Foreign Key
//    public void addBook(Book book){
//        if (book != null){
//            book.setAuthor(this);
//            this.setBook(book);
//        }
//    }


    public void addBookList(BookO2M bookO2M){
        if (bookO2M != null){
            if (bookList == null){
                bookList = new ArrayList<BookO2M>();
            }
            bookO2M.setAuthorO2M(this);
            bookList.add(bookO2M);
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

    public AddressO2M getAddressO2M() {
        return addressO2M;
    }

    public void setAddressO2M(AddressO2M addressO2M) {
        this.addressO2M = addressO2M;
    }

    public List<BookO2M> getBookList() {
        return bookList;
    }

    public void setBookList(List<BookO2M> bookList) {
        this.bookList = bookList;
    }
}


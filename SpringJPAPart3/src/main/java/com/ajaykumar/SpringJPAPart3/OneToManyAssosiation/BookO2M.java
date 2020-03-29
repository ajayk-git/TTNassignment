

package com.ajaykumar.SpringJPAPart3.OneToManyAssosiation;

import javax.persistence.*;

@Entity
@Table(name = "BookOneToMany")

public class BookO2M {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookid;
    private String bookName;
   public BookO2M(){

 }
  // for ques7.
   @ManyToOne(cascade = CascadeType.ALL)
   @JoinColumn(name = "author_id")
  AuthorO2M authorO2M;

    public BookO2M(String bookName) {
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

    public AuthorO2M getAuthorO2M() {
        return authorO2M;
    }

    public void setAuthorO2M(AuthorO2M authorO2M) {
        this.authorO2M = authorO2M;
    }


}

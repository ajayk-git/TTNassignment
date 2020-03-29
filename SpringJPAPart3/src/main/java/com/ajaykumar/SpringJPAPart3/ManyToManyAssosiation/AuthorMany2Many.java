package com.ajaykumar.SpringJPAPart3.ManyToManyAssosiation;

import com.ajaykumar.SpringJPAPart3.OneToManyAssosiation.BookO2M;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
public class AuthorMany2Many {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
     //   @Column(name = "AuthorID")
        private int authorId;
        private String authorName;
        @ManyToOne(cascade = CascadeType.ALL)
        @JoinTable(name = "AuthorBookMany2Many",
                joinColumns =@JoinColumn(name = "Author_ID",referencedColumnName = "author_id"),
                inverseJoinColumns =@JoinColumn(name = "Book_ID",referencedColumnName = "book_id") )
        private List<BookMany2Many> bookMany2ManyList;

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

    public List<BookMany2Many> getBookMany2ManyList() {
        return bookMany2ManyList;
    }

    public void setBookMany2ManyList(List<BookMany2Many> bookMany2ManyList) {
        this.bookMany2ManyList = bookMany2ManyList;
    }

    public void addBookList(BookMany2Many bookMany2Many){
        if (bookMany2Many != null){
            if (bookMany2ManyList == null){
                bookMany2ManyList = new ArrayList<BookMany2Many>();
            }
            bookMany2Many.setAuthorMany2ManyList((List<AuthorMany2Many>) this);
            bookMany2ManyList.add(bookMany2Many);
        }
    }
}

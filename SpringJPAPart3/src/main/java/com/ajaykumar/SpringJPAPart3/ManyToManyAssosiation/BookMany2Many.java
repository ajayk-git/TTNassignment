package com.ajaykumar.SpringJPAPart3.ManyToManyAssosiation;

import com.ajaykumar.SpringJPAPart3.Entity.Author;

import javax.persistence.*;
import java.util.List;
@Entity
public class BookMany2Many {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   // @Column(name = "BookId")
    private int bookid;
    private String bookName;
    @ManyToMany(mappedBy = "bookMany2ManyList")
    private List<AuthorMany2Many> authorMany2ManyList;

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public List<AuthorMany2Many> getAuthorMany2ManyList() {
        return authorMany2ManyList;
    }

    public void setAuthorMany2ManyList(List<AuthorMany2Many> authorMany2ManyList) {
        this.authorMany2ManyList = authorMany2ManyList;
    }
}

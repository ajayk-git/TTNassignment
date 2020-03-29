package com.ajaykumar.SpringJPAPart3.Repository;

import com.ajaykumar.SpringJPAPart3.Entity.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Integer> {
}

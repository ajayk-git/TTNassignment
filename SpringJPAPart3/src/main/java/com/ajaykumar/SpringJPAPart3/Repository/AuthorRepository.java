package com.ajaykumar.SpringJPAPart3.Repository;

import com.ajaykumar.SpringJPAPart3.Entity.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Integer> {
}

package com.ajaykumar.SpringJPAPart3.Repository;

import com.ajaykumar.SpringJPAPart3.ManyToManyAssosiation.AuthorMany2Many;
import org.springframework.data.repository.CrudRepository;

public interface AuthorM2MRepository extends CrudRepository<AuthorMany2Many,Integer> {

}

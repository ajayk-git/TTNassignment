package com.ajaykumar.SpringJPAPart3.Repository;

import com.ajaykumar.SpringJPAPart3.OneToManyAssosiation.AuthorO2M;
import org.springframework.data.repository.CrudRepository;

public interface AuthorO2MRepository extends
        CrudRepository<AuthorO2M, Integer> {
}

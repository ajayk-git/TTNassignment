package com.ajaykumar.SpringJPApart2.InheritanceMapping.Repository;

import com.ajaykumar.SpringJPApart2.InheritanceMapping.Entity.EmployeeTTN;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeTTNRepository extends CrudRepository<EmployeeTTN,Integer> {
}

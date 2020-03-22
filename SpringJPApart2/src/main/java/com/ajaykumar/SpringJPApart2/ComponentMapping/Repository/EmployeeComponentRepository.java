package com.ajaykumar.SpringJPApart2.ComponentMapping.Repository;
import com.ajaykumar.SpringJPApart2.ComponentMapping.Entity.EmployeeComponentMapping;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeComponentRepository extends CrudRepository<EmployeeComponentMapping,Integer> {
}

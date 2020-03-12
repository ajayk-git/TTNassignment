package com.tothenew.bootcamp.springdata.SpringDataJPA;
import com.tothenew.bootcamp.springdata.SpringDataJPA.entity.Employee;
import com.tothenew.bootcamp.springdata.SpringDataJPA.repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;
import java.util.Optional;
import java.util.Properties;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class SpringDataJpaApplicationTests {

	@Autowired
     EmployeeRepository employeeRepository;


	@Test
	void createTest(){
		Employee employee = new Employee();
		employee.setAge(25);
		employee.setName("Aman Sharma");
		employee.setLocation("America");
		employeeRepository.save(employee);
		Employee employee1 = new Employee();
		employee1.setAge(25);
		employee1.setName("Aakash Arora");
		employee1.setLocation("Delhi");
		employeeRepository.save(employee1);
		Employee employee2 = new Employee();
		employee2.setAge(28);
		employee2.setName("Shrey pandey");
		employee2.setLocation("South America");
		employeeRepository.save(employee2);

	}
	@Test
	void readByIdTestEmployee(){
		Optional<Employee> optionalEmployee=employeeRepository.findById(1);
		assertNotNull(optionalEmployee);
		assertEquals(1,optionalEmployee.get().getId());
		System.out.println(optionalEmployee.get().toString());
	}


//	@Test
//	void pagingSortingTestEmployee(){
//		Pageable pageable=new PageRequest(0,3, Sort.Direction.DESC);
//		Page<Employee> result = employeeRepository.findAll();
//	}

	@Test
	void readByNameTestEmployee(){

		Optional<Employee> optionalEmployee =employeeRepository.findByName("Ajay Kumar");
		assertNotNull(optionalEmployee);
		assertEquals("Ajay Kumar",optionalEmployee.get().getName());
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println(optionalEmployee.get().toString());
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}

	@Test
	void updateTestEmployee(){
		Optional<Employee> optionalEmployee=employeeRepository.findById(2);
		assertNotNull(optionalEmployee);
		assertEquals(2,optionalEmployee.get().getId());
		optionalEmployee.get().setLocation("Jammmu");
		employeeRepository.save(optionalEmployee.get());

	}
	@Test
	void nameStartsFromATestEmployee(){
		List<Employee> employeeList=employeeRepository.findByNameLike("A%");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println(employeeList.toString());
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}



	@Test
	void findEmployeeAgeBetweenTestEmployee(){

		List<Employee> employeeList = employeeRepository.findByAgeBetween(28,32);
		employeeList.forEach(emp-> System.out.println(emp.toString()));
//		employeeList.forEach(emp-> System.out.println(emp.getName()));
//		employeeList.forEach(emp-> System.out.println(emp.getAge()));

	}
	@Test
	void deleteTestEmployee(){
		employeeRepository.deleteById(11);
	}

	@Test
	void countTestEmployee(){
		long count=employeeRepository.count();
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Total records in Employee Table are : "+count);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
	}


}

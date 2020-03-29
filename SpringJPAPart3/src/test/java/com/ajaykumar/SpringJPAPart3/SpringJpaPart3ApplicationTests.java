package com.ajaykumar.SpringJPAPart3;

import com.ajaykumar.SpringJPAPart3.Entity.Address;
import com.ajaykumar.SpringJPAPart3.Entity.Author;
import com.ajaykumar.SpringJPAPart3.Entity.Book;
import com.ajaykumar.SpringJPAPart3.Entity.Subject;
import com.ajaykumar.SpringJPAPart3.ManyToManyAssosiation.AuthorMany2Many;
import com.ajaykumar.SpringJPAPart3.ManyToManyAssosiation.BookMany2Many;
import com.ajaykumar.SpringJPAPart3.OneToManyAssosiation.AddressO2M;
import com.ajaykumar.SpringJPAPart3.OneToManyAssosiation.AuthorO2M;
import com.ajaykumar.SpringJPAPart3.OneToManyAssosiation.BookO2M;
import com.ajaykumar.SpringJPAPart3.Repository.AuthorM2MRepository;
import com.ajaykumar.SpringJPAPart3.Repository.AuthorO2MRepository;
import com.ajaykumar.SpringJPAPart3.Repository.AuthorRepository;
import com.ajaykumar.SpringJPAPart3.Repository.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJpaPart3ApplicationTests {
    @Autowired
	AuthorRepository authorRepository;
    @Autowired
	BookRepository bookRepository;
    @Autowired
	AuthorO2MRepository authorO2MRepository;
	@Autowired
	AuthorM2MRepository authorM2MRepository;

	//Ques 4: Persist 3 subjects for each author.
	@Test
	void addAuthorTest(){
		Author author = new Author();
		author.setAuthorName("Aman Sharma");

		Address address = new Address();
		address.setStreetNumber(1786);
		address.setLocation("Delhi");
		address.setState("New Delhi");

		author.setAddress(address);

		Subject subject1 = new Subject();
		subject1.setSubjectName("Java");
		subject1.setAuthor(author);

		Subject subject2 = new Subject();
		subject2.setSubjectName("HTML");
		subject2.setAuthor(author);

		Subject subject3 = new Subject();
		subject3.setSubjectName("BootStrap");
		subject3.setAuthor(author);

		author.addSubject(subject1);
		author.addSubject(subject3);
		author.addSubject(subject2);
		authorRepository.save(author);
	}
// OUTPUT:
//      	+-----------+-----------+----------+---------------+--------------+
//			| author_id | state     | location | street_number | author_name  |
//			+-----------+-----------+----------+---------------+--------------+
//			|         1 | Rajasthan | Alwar    |           123 | Ajay Kumar   |
//			|         2 | Rajasthan | Jaipur   |           125 | Vijay Kumar  |
//			|         3 | New Delhi | Narela   |           125 | Chirag Bohet |
//			+-----------+-----------+----------+---------------+--------------+

//      	+------------+---------------+-----------+
//			| subject_id | subject_name  | author_id |
//			+------------+---------------+-----------+
//			|          1 | English       |         1 |
//			|          2 | Maths         |         1 |
//			|          3 | Science       |         1 |
//			|          4 | Physics       |         2 |
//			|          5 | Chemistry     |         2 |
//			|          6 | Maths         |         2 |
//			|          7 | Java          |         3 |
//			|          8 | C++           |         3 |
//			|          9 | Web Designing |         3 |
//			+------------+---------------+-----------+

//6.Implement One to One mapping between Author and Book
	@Test
	public void testOneToOne(){
		Author author = new Author();
		author.setAuthorName("RD Sharma");

		Book book = new Book();
		book.setBookName("TO The Mathematics");
		author.addBook(book);

		Address address = new Address();
		address.setStreetNumber(732);
		address.setLocation("Rajuori Garden");
		address.setState("New Delhi");
		author.setAddress(address);

		Subject subject = new Subject();
		subject.setSubjectName("Mathematics");
		author.addSubject(subject);
		authorRepository.save(author);
	}

//	mysql> select * from author;
//          +-----------+-----------+----------------+---------------+---------------+
//   		| author_id | state     | location       | street_number | author_name   |
//			+-----------+-----------+----------------+---------------+---------------+
//			|         1 | Rajasthan | Alwar          |            15 | Ajay Kumar    |
//			|         2 | Rajasthan | Alwar          |            15 | Vijay Kumar   |
//			|         3 | New Delhi | Delhi          |          1786 | Aman Sharma   |
//			|         4 | New Delhi | Dwarka         |           789 | Shreya Mago   |
//			|        11 | New Delhi | Tilak Nagar    |           789 | Kamlesh Kumar |
//			|        12 | U.P.      | Kanpur         |           732 | HC Verma      |
//			|        13 | New Delhi | Rajuori Garden |           732 | RD Sharma     |
//			+-----------+-----------+----------------+---------------+---------------+

//	mysql> select * from subject;
//			+------------+----------------------------+-----------+
//			| subject_id | subject_name               | author_id |
//			+------------+----------------------------+-----------+
//			|          1 | Maths                      |         1 |
//			|          2 | Java                       |         1 |
//			|          3 | Sanksrit                   |         2 |
//			|          4 | Physics                    |         2 |
//			|          6 | Java                       |         3 |
//			|          7 | BootStrap                  |         3 |
//			|          8 | HTML                       |         3 |
//			|          9 | Database Management System |         4 |
//			|         16 | Mathematics                |        11 |
//			|         17 | Physics                    |        12 |
//			|         18 | Mathematics                |        13 |
//			+------------+----------------------------+-----------+
//			11 rows in set (0.00 sec)
//
//	mysql> select * from books;
//			+--------+--------------------+-----------+
//			| bookid | book_name          | author_id |
//			+--------+--------------------+-----------+
//			|      1 | TO The Maths       |        11 |
//			|      2 | TO The Physics     |        12 |
//			|      3 | TO The Mathematics |        13 |
//			+--------+--------------------+-----------+
//			3 rows in set (0.00 sec)
//


	//Ques 7:Implement One to Many Mapping between Author and Book(Unidirectional, BiDirectional
	// and without additional table ) and implement cascade save.
	@Test
	//@Transactional
	// transactional annotation will rolled back at the end of test completion and data doesn't get added to database
	public void testOneToMany(){
		AuthorO2M authorO2M =new AuthorO2M();
		authorO2M.setAuthorName("Rakesh Yadav");

		AddressO2M address = new AddressO2M();
		address.setStreetNumber(420);
		address.setLocation("Behror");
		address.setState("Rajasthan");
		authorO2M.setAddressO2M(address);


		BookO2M book1 = new BookO2M();
		book1.setBookName("Intro to Hindi Grammer");
		authorO2M.addBookList(book1);

		BookO2M book2 = new BookO2M();
		book2.setBookName("Intro to Hindi Essay");
		authorO2M.addBookList(book2);

		authorO2MRepository.save(authorO2M);

	}

//	mysql> select * from authorO2M;
//			+-----------+-----------+----------+---------------+--------------+
//			| author_id | state     | location | street_number | author_name  |
//			+-----------+-----------+----------+---------------+--------------+
//			|         1 | Rajasthan | Behror   |           420 | Rakesh Yadav |
//			+-----------+-----------+----------+---------------+--------------+
//			1 row in set (0.00 sec)
//
//	mysql> select * from booksO2M;
//			+--------+------------------------+-----------+
//			| bookid | book_name              | author_id |
//			+--------+------------------------+-----------+
//			|      1 | Intro to Hindi Grammer |         1 |
//			|      2 | Intro to Hindi Essay   |         1 |
//			+--------+------------------------+-----------+
//			2 rows in set (0.00 sec)

//Ques8. Implement Many to Many Mapping between Author and Book.

		@Test
 		public void testManyToMany(){
		AuthorMany2Many authorMany2Many =new AuthorMany2Many();
		authorMany2Many.setAuthorName("Chandra Shekhar");


		BookMany2Many book1 = new BookMany2Many();
		book1.setBookName("Intro to 1857 Revolution");
		authorMany2Many.addBookList(book1);

		BookMany2Many book2 = new BookMany2Many();
		book2.setBookName("Independent India");
		authorMany2Many.addBookList(book2);

		authorM2MRepository.save(authorMany2Many);

	}


//	Ques9.Which method on the session object can be used to remove an object from the cache?
//  Ans9.evict() is used to remove a particular object from the cache memory.

//	Ques10.What does @transactional annotation do?
//  Ans10.	It ensures that either entire job would be committed or completely roll back the operation.
}

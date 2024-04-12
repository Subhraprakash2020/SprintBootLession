package com.example.JDBCSpring;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepo extends CrudRepository<Student, Integer>{
	
	List<Student> findBySec(String sec);
	List<Student> findByrollnoGreaterThan(int rollno);
	
	@Query("from Student where rollno=?1 order by name")
	List<Student> findByTechSorted(String sec);
}

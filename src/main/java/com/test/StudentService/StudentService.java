package com.test.StudentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.test.entity.Student;
import com.test.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentrepo;
	
	public List<Student> getall()
	{
		return studentrepo.findAll();
	}
	
	public Student getbyId(@PathVariable Integer id)
	{
		return studentrepo.getById(id);
	}

}

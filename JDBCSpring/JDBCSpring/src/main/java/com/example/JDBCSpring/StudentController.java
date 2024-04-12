package com.example.JDBCSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
	
	@Autowired
	StudentRepo repo;
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	@RequestMapping("/addStudent")
	public String addStudent(Student student) {
		repo.save(student);
		return "home.jsp";
	}
	
//	@RequestMapping("/getStudent")
//	public ModelAndView getStudent(@RequestParam int rollno) {
//		ModelAndView mv = new ModelAndView("ShowStudent.jsp");
//		Student student = repo.findById(rollno).orElse(new Student());
//		
//		System.out.println(repo.findBySec("a"));
//		System.out.println(repo.findByrollnoGreaterThan(1));
////		System.out.println(repo.findByTechSorted(""));
//		mv.addObject(student);
//		return mv;
//	}
	
//	@RequestMapping("/students")
//	@ResponseBody
//	public String getStudents() {
//		return repo.findAll().toString();
//	}
	
	@RequestMapping("/student/2")
	@ResponseBody
	public String getStudents() {
		return repo.findById(2).toString();
	}
	@RequestMapping("/student/{rollno}")
	@ResponseBody
	public String getStudentsAll(@PathVariable("rollno") int rollno) {
		return repo.findById(rollno).toString();
	}
}

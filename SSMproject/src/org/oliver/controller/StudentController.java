package org.oliver.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.oliver.entity.Student;
import org.oliver.service.StudentService;
import org.oliver.serviceImpl.StudentServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sun.xml.internal.ws.wsdl.writer.document.Service;

@Controller
@RequestMapping("Controller")

public class StudentController {
	@Autowired
	@Qualifier("studentService")
	private StudentService StudentService;
	

	public void setStudentService(StudentService studentService) {
		StudentService = studentService;
	}


	@RequestMapping("queryStudentByNo/{stuNo}")	
	public String queryStudentByNo(@PathVariable("stuNo") Integer stuNo, Map<String,Object> map  ) {
		Student student=StudentService.queryStudentByNo(stuNo);
		map.put("student", student);
		return "result";
	}
	
	
	
}

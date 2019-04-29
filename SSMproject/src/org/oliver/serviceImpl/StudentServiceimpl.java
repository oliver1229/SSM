package org.oliver.serviceImpl;

import java.util.List;

import org.oliver.entity.Student;
import org.oliver.mapper.StudentMapper;
import org.oliver.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

import com.sun.org.apache.xml.internal.security.keys.keyresolver.implementations.PrivateKeyResolver;

public class StudentServiceimpl implements StudentService{

	
	
	private StudentMapper studentMapper;
	
	public void setStudentMapper(StudentMapper studentMapper) {
		this.studentMapper = studentMapper;
	}

	@Override
	public Student queryStudentByNo(int stuNo) {
		return studentMapper.queryStudentByStuno(stuNo);
		
	}

	

	



	

	
}

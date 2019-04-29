package org.oliver.mapper;

import java.util.List;

import org.oliver.entity.Student;

public interface StudentMapper {
	
	Student  queryStudentByStuno(int stuNo);
}

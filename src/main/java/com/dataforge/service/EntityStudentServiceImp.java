package com.dataforge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dataforge.dao.StudentRespo;
import com.dataforge.entity.EntityStudent;

@Service
public class EntityStudentServiceImp implements EntityStudentService {
	
	@Autowired
	 private StudentRespo entityStudent;

	@Override
	public EntityStudent saveEntityStudent(EntityStudent entity) {
		// TODO Auto-generated method stub
		return entityStudent.save(entity);
	}

	@Override
	public List<EntityStudent> getAllEntityStudent() {
		// TODO Auto-generated method stub
		return entityStudent.findAll();
	}

}

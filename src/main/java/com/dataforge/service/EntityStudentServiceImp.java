package com.dataforge.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dataforge.dao.StudentRespo;
import com.dataforge.entity.EntityStudent;

@Service
public class EntityStudentServiceImp implements EntityStudentService {
	
	@Autowired
	 private StudentRespo entityStudent;

    /*to save the entity student data in database*/
	@Override
	public boolean saveEntityStudent(EntityStudent entity) {
		// TODO Auto-generated method stub
		entity= entityStudent.save(entity);
		return entity.getId()>0;
	}
    /*to get all enttity student data from db*/
	@Override
	public List<EntityStudent> getAllEntityStudent() {
		// TODO Auto-generated method stub
		return entityStudent.findAll();
	}
	@Override
	public Optional<EntityStudent> getById(int id) {
		
		Optional<EntityStudent> entity=entityStudent.findById(id);
		return entity;
	}
	@Override
	public void deleteById(int id) {
          entityStudent.deleteById(id);
	
	}

	
}

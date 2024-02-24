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
	public EntityStudent saveEntityStudent(EntityStudent entity) {
		// TODO Auto-generated method stub
		EntityStudent en= entityStudent.save(entity);
		return en;
	}
    /*to get all enttity student data from db*/
	@Override
	public List<EntityStudent> getAllEntityStudent() {
		// TODO Auto-generated method stub
		return entityStudent.findAll();
	}
	/*fetch the data student data based on id*/
	@Override
	public EntityStudent getById(int id) {
		
		EntityStudent entity=entityStudent.findById(id).get();
		return entity;
	}
	/*delete student data*/
	@Override
	public void deleteById(int id) {
          entityStudent.deleteById(id);
	
	}

	
}

package com.dataforge.service;

import java.util.List;
import java.util.Optional;

import com.dataforge.entity.EntityStudent;

public interface EntityStudentService {
                 /* EntityStudent service interface to added functionality of abstarct*/
	           public EntityStudent saveEntityStudent(EntityStudent entity);
	           
	           public List<EntityStudent> getAllEntityStudent();
	           
	           public EntityStudent getById(int id);
	           
	           public void deleteById(int id);
	           
}

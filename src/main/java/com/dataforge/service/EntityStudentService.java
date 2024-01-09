package com.dataforge.service;

import java.util.List;
import java.util.Optional;

import com.dataforge.entity.EntityStudent;

public interface EntityStudentService {
                 /* EntityStudent service interface to added functionality of abstarct*/
	           public boolean saveEntityStudent(EntityStudent entity);
	           
	           public List<EntityStudent> getAllEntityStudent();
	           
	           public Optional<EntityStudent> getById(int id);
	           
	           public void deleteById(int id);
	           
}

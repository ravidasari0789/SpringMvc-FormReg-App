package com.dataforge.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dataforge.entity.EntityStudent;

@Repository
public interface StudentRespo extends JpaRepository<EntityStudent, Integer>{

}

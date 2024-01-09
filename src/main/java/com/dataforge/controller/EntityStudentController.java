package com.dataforge.controller;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import com.dataforge.entity.EntityStudent;
import com.dataforge.service.EntityStudentService;

@Controller
public class EntityStudentController {

	             @Autowired
				 
	             private EntityStudentService entityStudentService;
	              @GetMapping("/")
				  /*getindex function to display the home*/
	              public String getIndex(Model model) {
	      
	            	      model.addAttribute("studentdata", new EntityStudent());
	            	     
	            	      return "index";
	              }
	              /*register form submition for EntityStudent*/
	              @PostMapping("/regiser")
	              public String getIndex(EntityStudent entityStudent,Model model) {
	            	   
	            	
	            	boolean b=  entityStudentService.saveEntityStudent(entityStudent);
	            	if(b) {
	            	      model.addAttribute("msg", "sucessfully saved data in db");
	            	}   
	            	      return "sucess";
	              }
	              /*Fetch all related to entity student data*/
	              @GetMapping("/viewdata")
	              public String getAllstucendData(Model model) {
	            	List<EntityStudent>  list= entityStudentService.getAllEntityStudent();
	            	  model.addAttribute("view", list);
	            	     return "viewstudenddata";
	              }
	              
	              @GetMapping(value="/updatestudent/{id}")
	              public String editstucendData(@PathVariable("id") int id, Model model) {
	            	   entityStudentService.getById(id);
	            	  model.addAttribute("update", "sucessupdate");
	            	     return "edit";
	              }
	              
	              
}

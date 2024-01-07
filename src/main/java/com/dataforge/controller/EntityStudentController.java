package com.dataforge.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.dataforge.entity.EntityStudent;
import com.dataforge.service.EntityStudentService;

@Controller
public class EntityStudentController {

	             @Autowired
	             private EntityStudentService entityStudentService;
	              @GetMapping("/")
	              public String getIndex(Model model) {
	            	  
	            	      model.addAttribute("studentdata", new EntityStudent());
	            	      
	            	      return "index";
	              }
	              
	              @GetMapping("/regiser")
	              public String getIndex(EntityStudent entityStudent,Model model) {
	            	   
	            	 
	            	  entityStudentService.saveEntityStudent(entityStudent);
	            	  System.out.println(entityStudent);
	            	      model.addAttribute("student", "sucessfully saved data in db");
	            	      
	            	      return "sucess";
	              }
	              
	              @GetMapping("/viewdata")
	              public String getAllstucendData(Model model) {
	            	List<EntityStudent>  list= entityStudentService.getAllEntityStudent();
	            	  model.addAttribute("view", list);
	            	     return "viewstudenddata";
	              }
}

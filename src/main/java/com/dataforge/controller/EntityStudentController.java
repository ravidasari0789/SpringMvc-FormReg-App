package com.dataforge.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

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
	            	   
	            	 
	            	boolean b=  entityStudentService.saveEntityStudent(entityStudent);
	            	if(b) {
	            	      model.addAttribute("msg", "sucessfully saved data in db");
	            	}   
	            	      return "index";
	              }
	              
	              @GetMapping("/viewdata")
	              public String getAllstucendData(Model model) {
	            	List<EntityStudent>  list= entityStudentService.getAllEntityStudent();
	            	  model.addAttribute("view", list);
	            	     return "viewstudenddata";
	              }
	              
	              @GetMapping("/edit")
	              public String editstucendData(Model model) {
	            	
	            	  model.addAttribute("edit", new EntityStudent());
	            	     return "edit";
	              }
	              
}

package com.dataforge.controller;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
	              @PostMapping("/register")
	              public String getIndex(EntityStudent entityStudent,Model model) {
	            	   
	            	
	            	  entityStudentService.saveEntityStudent(entityStudent);
	            	
	            	      model.addAttribute("msg", "Sucessfully Saved Data");
	            	  
	            	      return "redirect:/";
	              }
	              /*Fetch all related to entity student data*/
	              @GetMapping("/viewdata")
	              public String getAllstucendData(Model model) {
	            	List<EntityStudent>  list= entityStudentService.getAllEntityStudent();
	            	  model.addAttribute("view", list);
	            	     return "viewstudenddata";
	              }
	              
	              @RequestMapping(value="/updatestudent/{id}")
	              public String editstucendData(@PathVariable("id") int id, Model model) {
	            	  EntityStudent entityStudent=  entityStudentService.getById(id);
	            	  model.addAttribute("update", entityStudent);
	            	     return "edit";
	              }
	              
	              @RequestMapping(value="/deletestudent/{id}")
	              public String deleteData(@PathVariable("id") int id, Model model) {
	            	  entityStudentService.deleteById(id);
	            	  model.addAttribute("update", "delete");
	            	     return "redirect:/viewdata";
	              }
	              
	              
}

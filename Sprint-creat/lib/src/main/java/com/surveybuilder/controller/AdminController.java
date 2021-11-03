package com.surveybuilder.controller;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.surveybuilder.entities.Admin;
import com.surveybuilder.entities.Feedback;
import com.surveybuilder.entities.Responses;
import com.surveybuilder.entities.Surveyor;
import com.surveybuilder.service.AdminService;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@RequestMapping
public class AdminController 
{
	@Autowired
	 private AdminService service=null;
	
	@PostMapping(path="admin")
		public void createAdminController(@RequestBody Admin admin)
		{
		   service.createAdmin(admin);
			
		}
		
	//http://localhost:9090/admin-api/surveyor
		@PostMapping( path= "surveyor")
		 public void createSurveyor( @RequestBody Surveyor surveyor)
		{
			 service.createSurveyor(surveyor);
		}
	    
		
		//http://localhost:9090/admin-api/responses
       @GetMapping (path="responses")
         public List<Responses> findAllById(int respondentId)
         {
    	  // Responses re= new Responses();
    	  List<Responses> list = service.findAllById(respondentId);
    	   return list;
         }

  //http://localhost:9090/admin-api/feedback
       @JsonIgnore
	    @GetMapping (path="feedback")
	    public Optional<Feedback> viewFeedback(int feedbackId)
	    {
	    	return service.viewFeedback(feedbackId);
	    	
	    }
	
	    	    
//	
}
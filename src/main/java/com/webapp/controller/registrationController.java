package com.webapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.webapp.Service.RegistrationService;
import com.webapp.dto.RegistrationDto;
import com.webapp.entity.Registration;

@Controller
public class registrationController {
	
	@Autowired
	private RegistrationService registrationService;

	//http://localhost:8080/view-registration-page
	
	
	//Handler Method
	
	@RequestMapping("/view-registration-page")
	public String viewsRegistrationPage() {
		return "new_registration";
		
	}
	
	
	
//      @RequestMapping("/saveReg")
//	 public String saveRegistration(@ModelAttribute Registration registration) {
//		
//		registrationService.saveRegistration(registration);
//		return"new_registration";
//	}
	
	
	

  //   @RequestMapping("/saveReg")
 //      public String saveRegistration(
//			 
//			@RequestParam("firstName") String fName, //fName is a method Argument
//			@RequestParam("lastName") String LName,  // LName is a Method Argument
//			@RequestParam("email") String email,     // email is a method Argument
	//		@RequestParam ("mobile") long mobile,     // mobile is a method Argument
	//		ModelMap model  //used for msg record saved 
			 
	//		 ) {
		
   // 	Registration registration = new Registration();
    //	registration.setFirstName(fName);
    //	registration.setLastName(LName);
    //	registration.setEmail(email);
    //	registration.setMobile(mobile);
    	
    	
    	
    	
	//	registrationService.saveRegistration(registration);
	//	model.addAttribute("msg", "Record is saved!!!");  //"msg" is a variable //its a set//put a"msg"variable in jsp pages
	//	return"new_registration";
//	}
	
	
	
	
	

    @RequestMapping("/saveReg")
	 public String saveRegistration(
			 
			RegistrationDto dto,        //<<create one package after create a a one class 
			ModelMap model              //used for msg record saved 
			 
			 ) {
		
    	Registration registration = new Registration();
    	registration.setFirstName(dto.getFirstName());
    	registration.setLastName(dto.getLastName());
    	registration.setEmail(dto.getEmail());
    	registration.setMobile(dto.getMobile());
    	
    	
    	
    	
		registrationService.saveRegistration(registration);
		model.addAttribute("msg", "Record is saved!!!");  //"msg" is a variable //its a set//put a"msg"variable in jsp pages
		return"new_registration";
	}
	
    
    
    
    //  http://localhost:8080/getAllReg     >>Show All Reg
    
	@RequestMapping("/getAllReg")
    public String getAllregistrations(Model model) {
		List<Registration> reg = registrationService.getAllregistrations();
		System.out.println(reg);
		model.addAttribute("registrations", reg);
		return "list_registrations";
    	
    }
	
	
	
	//  http://localhost:8080/getAllReg     >>delete id
	
	@RequestMapping("/delete")
	public String deletebyId(@RequestParam("id")long id,Model model) {
		registrationService.deletebyId(id);
		List<Registration> reg = registrationService.getAllregistrations();
		model.addAttribute("registrations", reg);
		return "list_registrations";
		
	}
	
	
}

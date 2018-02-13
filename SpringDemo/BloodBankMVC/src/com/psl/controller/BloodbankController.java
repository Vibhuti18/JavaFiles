package com.psl.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.psl.beans.Donor;
import com.psl.beans.Employee;
import com.psl.service.BloodBankService;




@Controller
public class BloodbankController {
	
	@Autowired
	private BloodBankService service; 
	

	@RequestMapping(value={"/","/home"},method=RequestMethod.GET)
	public String showHomePage(Model model) {
		// TODO Auto-generated method stub
		
		System.out.println("In employee Controller.showHomePage()");
		model.addAttribute("message", "Hello World!!");
		model.addAttribute("employee", new Donor());
		
		List<Donor> list = service.getAllEmployees();
		model.addAttribute("list", list);
		//List<Employee>=
		return "home";
	}

	
	@RequestMapping(value="/{empName}",method=RequestMethod.GET)
	public String showEmpPage(Model model,@PathVariable String empName,
			@RequestParam(required=false) String dept) {
		// TODO Auto-generated method stub
		
		System.out.println("In employee Controller.showEmpPage() I clicked "+empName);
		System.out.println( dept);
		model.addAttribute("message", "Hello "+empName);
		model.addAttribute("empName", empName);
		model.addAttribute("dept", dept);
		return "emp";
	}
	
	
	@RequestMapping(value={"/","/home"},method=RequestMethod.POST)
	public String register(Model model,@Valid @ModelAttribute Donor e,BindingResult result) {
		// TODO Auto-generated method stub
		
		System.out.println("register "+e);
		
		
		if(result.hasErrors())
			return "home";
		
	
		service.createEmployee(e);
		//service.getAllEmployees();
		return "redirect:/home";
	}

	

}

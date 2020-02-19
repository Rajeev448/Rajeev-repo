package com.webcore.app.loan.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.webcore.app.loan.main.model.EmiDetails;
import com.webcore.app.loan.main.service.ServiceIntf;

@Controller
public class HomeController 
{
	@Autowired
	ServiceIntf s;
	
	//@PostMapping("/reg")
	@RequestMapping(value="/reg", method=RequestMethod.POST)
	public void savedata(@RequestBody EmiDetails ed) 
	{
		s.savedata(ed);
	}
}

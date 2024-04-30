package com.bookStore.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookStore.demo.Service.AutherService;

@RestController
@RequestMapping("auther")
public class AutherController {

	
	@Autowired
	 AutherService autherService;
	
	
	
	
}

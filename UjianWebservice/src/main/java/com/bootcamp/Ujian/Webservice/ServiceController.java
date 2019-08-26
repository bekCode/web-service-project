package com.bootcamp.Ujian.Webservice;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.Ujian.model.User;
import com.bootcamp.controller.Controller;
import com.bootcamp.Ujian.model.User;
import com.bootcamp.Ujian.model.Group;
import com.bootcamp.Ujian.model.Personnel;
import com.bootcamp.Ujian.model.Personnel;

@RestController
public class ServiceController {

	
	@GetMapping(path = "programmer/user/all")
	public List<User> getAllUser() {
		return Controller.getInstance().getAllUser();
		
	}
	
	@GetMapping(path = "programmer/group/all")
	public List<Group> getAllGroup() {
		return Controller.getInstance().getAllGroup();
	}
}
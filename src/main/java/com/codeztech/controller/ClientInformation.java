package com.codeztech.controller;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@RestController
@EnableWebMvc
@Profile("lambda")
//@RequestMapping("/app/v2")
public class ClientInformation {
	@Value("${clientDetails.userName}")
	private String userName;
	
	@Value("${clientDetails.userId}")
	private int userId;
	
	@Value("${clientDetails.userAddress}")
	private String userAddress;
	
	@GetMapping("/ping")
	public Map<String, Object> getDetails()  {	
		Map<String, Object> rtn = new HashMap<>();
	    rtn.put("company", "Vmware");
	    return rtn;
	}
	
	@GetMapping("/information")
	public Map<String, Object> getInformation()  {	
		Map<String, Object> rtn = new HashMap<>();
	    rtn.put("name", userName);
	    rtn.put("id", userId);
	    return rtn;
	}
	
	@GetMapping("/hello")
    public String add() {
        return "Hello";
    }
}

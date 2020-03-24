package com.ragul.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ragul.service.*;

@Controller
public class MyController {

	@Autowired
	CountryService cs;
	
	@RequestMapping("/")
	public void get() {
		System.out.println("-------------------------");
		System.out.println(cs.search("ar"));
		System.out.println("-------------------------");
		System.out.println(cs.searchAsc("ar"));
		System.out.println("-------------------------");
		System.out.println(cs.searchCharacter('R'));
		System.out.println("-------------------------");
	}
	
}

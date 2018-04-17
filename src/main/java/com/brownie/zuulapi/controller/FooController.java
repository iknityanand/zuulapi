package com.brownie.zuulapi.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brownie.zuulapi.domain.Foo;

@RestController
public class FooController {
	
	@RequestMapping("/call")
    public String index() {
        return "Greetings from Spring Boot!";
    }
	
	@GetMapping(value="/foos/{id}")
	public Foo findbyId(@PathVariable long id, HttpServletRequest req, HttpServletResponse res) {
		return new Foo(Long.parseLong(RandomStringUtils.randomNumeric(2)), RandomStringUtils.randomAlphabetic(4));
	}
}

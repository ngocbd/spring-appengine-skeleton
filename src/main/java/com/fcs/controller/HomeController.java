package com.fcs.controller;

import java.util.concurrent.ExecutionException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class HomeController {

	@GetMapping(value = "/")
	public String index() throws InterruptedException, ExecutionException {

		return "views/home/index";
	}

	@GetMapping(value = "/welcome")
	public String welcome() throws InterruptedException, ExecutionException {

		return "welcome";
	}

}

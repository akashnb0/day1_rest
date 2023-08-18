package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController3 {
	@Value("${fav}")
	private String yourFavColor;
	@GetMapping("/color")
	public String getMyFav()
	{
		return "My favorite color is " + yourFavColor;
	}
}

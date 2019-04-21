package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.service.BookService;

@Controller
public class BookController {
	@Autowired
	BookService bookService;
	
	@GetMapping("/books")
	public String getBookList(Model model) {
		model.addAttribute("bookList", bookService.getBookList());
		return "book";
	}
}

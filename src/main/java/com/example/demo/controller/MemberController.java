package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {
	@GetMapping("/listMember")
	public String listMember() {
		return "회원목록";
	}

}

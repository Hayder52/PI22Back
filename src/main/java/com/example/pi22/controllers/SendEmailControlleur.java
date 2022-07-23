package com.example.pi22.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.pi22.services.SendEmail;
@RestController
@CrossOrigin("*")
@RequestMapping("/send")

public class SendEmailControlleur {
	@Autowired
	private SendEmail sendEmail;
	
	@PostMapping("/mail/{email}/{obj}/{text}")
public void SendEmail(@PathVariable String email ,@PathVariable String obj ,@PathVariable String  text) {
		sendEmail.sendMail(email, obj, text);
	}
}

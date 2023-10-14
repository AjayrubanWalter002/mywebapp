package com.mobiledetailsapimywebapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
 @GetMapping("/getName")
 public String getName() {
	 return "Hello World!";
 }
}

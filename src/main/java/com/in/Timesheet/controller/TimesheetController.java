package com.in.Timesheet.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/signup")
public class TimesheetController {

  @GetMapping
  public String showSignupForm() {
    return "signup.html";
  }
}
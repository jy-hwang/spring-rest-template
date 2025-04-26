package com.sp.fc.controller;

import com.sp.fc.dto.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/server")
public class ServerApiController {

  @GetMapping("/hello")
  public String hello() {
    return "Hello World";
  }

  @GetMapping("/helloJson")
  public User helloJson() {
    User user = new User();
    user.setName("John");
    user.setAge(22);

    return user;
  }

  @GetMapping("/helloJson2")
  public User helloJson2(@RequestParam String name, @RequestParam Integer age) {
    User user = new User();
    user.setName(name);
    user.setAge(age);

    return user;
  }
}

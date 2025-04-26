package com.sp.fc.controller;

import com.sp.fc.dto.UserResponse;
import com.sp.fc.service.RestTemplateService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/client")
public class ApiController {

  private final RestTemplateService restTemplateService;

  public ApiController(RestTemplateService restTemplateService) {
    this.restTemplateService = restTemplateService;
  }

  @GetMapping("/hello/getForObject")
  public String getHelloForObject() {
    return restTemplateService.helloGetForObject();
  }

  @GetMapping("/hello/getForEntity")
  public String getHelloForEntity() {
    return restTemplateService.helloGetForEntity();
  }

  @GetMapping("/hello/getForEntity2")
  public UserResponse getHelloForEntity2() {
    return restTemplateService.helloGetForEntity2();
  }

  @GetMapping("/hello/getForEntity3")
  public UserResponse getHelloForEntity3() {
    return restTemplateService.helloGetForEntity3();
  }
}

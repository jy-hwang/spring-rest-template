package com.sp.fc.controller;

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

  @GetMapping("/hello")
  public String getHello() {
    return restTemplateService.hello();
  }
}

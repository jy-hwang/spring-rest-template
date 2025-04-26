package com.sp.fc.service;

import com.sp.fc.dto.UserResponse;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Service
public class RestTemplateService {

  // http://localhost/api/server/hello
  // response
  public String helloGetForObject() {
    URI uri = UriComponentsBuilder
            .fromUriString("http://localhost:7070")
            .path("/api/server/hello")
            .encode()
            .build().toUri();
    System.out.println(uri);

    RestTemplate restTemplate = new RestTemplate();
    String result = restTemplate.getForObject(uri, String.class);

    return result;
  }

  public String helloGetForEntity() {
    URI uri = UriComponentsBuilder
            .fromUriString("http://localhost:7070")
            .path("/api/server/hello")
            .encode()
            .build().toUri();
    System.out.println(uri);

    RestTemplate restTemplate = new RestTemplate();
    ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);
    System.out.println(result.getStatusCode());
    System.out.println(result.getBody());

    return result.getBody();
  }

  public UserResponse helloGetForEntity2() {
    URI uri = UriComponentsBuilder
            .fromUriString("http://localhost:7070")
            .path("/api/server/helloJson")
            .encode()
            .build().toUri();
    System.out.println(uri);

    RestTemplate restTemplate = new RestTemplate();
    ResponseEntity<UserResponse> result = restTemplate.getForEntity(uri, UserResponse.class);
    System.out.println(result.getStatusCode());
    System.out.println(result.getBody());

    return result.getBody();
  }

  public UserResponse helloGetForEntity3() {
    URI uri = UriComponentsBuilder
            .fromUriString("http://localhost:7070")
            .path("/api/server/helloJson2")
            .queryParam("name", "Steve")
            .queryParam("age", 35)
            .encode()
            .build().toUri();
    //http://localhost:7070/api/server/helloJson?name=Steve&age=35
    System.out.println(uri);

    RestTemplate restTemplate = new RestTemplate();
    ResponseEntity<UserResponse> result = restTemplate.getForEntity(uri, UserResponse.class);
    System.out.println(result.getStatusCode());
    System.out.println(result.getBody());

    return result.getBody();
  }

}

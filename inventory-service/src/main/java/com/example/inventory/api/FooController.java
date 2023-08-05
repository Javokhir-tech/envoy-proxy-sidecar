package com.example.inventory.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class FooController {

  @GetMapping("/foo")
  public String fooEndpoint() {
    return "Hello from /foo endpoint!";
  }

  @GetMapping("/bar")
  public String barEndpoint() {
    return "Hello from /bar endpoint!";
  }
}

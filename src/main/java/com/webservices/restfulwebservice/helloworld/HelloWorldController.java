package com.webservices.restfulwebservice.helloworld;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @RequestMapping(method = RequestMethod.GET,path = "/hello-world")
    public String HelloWorld(){
        return "Hello World";
    }

    @GetMapping(path = "/hello-world-bean")
    public HellowWorldBean helloWorldBean(){
        return new HellowWorldBean("Hello-World-Bean");
    }


    //Path Parameter
    @GetMapping(path = "/hello-world/path-variable/{name}")
    public HellowWorldBean helloWorldPathVariable(@PathVariable String name){
        return new HellowWorldBean(String.format("Hello World, %s", name));
    }
}

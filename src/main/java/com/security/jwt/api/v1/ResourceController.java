package com.security.jwt.api.v1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {

    private static final String URI = "/v1/resources";
    @GetMapping(URI+"/admin")
    public String admin(){
        return "Hello Admin!";
    }

    @GetMapping(URI+"/user")
    public String user(){
        return "Hello User!";
    }

}

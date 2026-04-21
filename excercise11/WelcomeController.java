package org.example.excercise11;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/getName")
    public String getName(){
       String name = "mohammed";
        return "My name is "+name;
    }

    @GetMapping("/getAge")
    public String getAge(){
        int age = 24;
    return "My age is "+age;
    }
    @GetMapping("/checkStatus")
    public String checkStatus(){
        boolean status = true;
        if (status){
            return "Everything is OK";
        } else return "Something is wrong";
    }
    @GetMapping("/health")
    public String health(){
        return "Server health is up and running";
    }
    @GetMapping("/getArrayNames")
    public String[] getArray(){
        String[] array = {"Mohammed","Saud","Anas"};
        return array;
    }


}

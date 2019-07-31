package com.stackroute.controller;

import com.stackroute.User;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class UserController {
    User user;
    @Bean
    public User user(){
          user = new User();
         user.setMessage("Sahoo");
         return user;

    }
    @RequestMapping(method= RequestMethod.GET)

    public String name(ModelMap modelMap){
        modelMap.addAttribute("Reference", user.getMessage());
        return "index";
    }
}

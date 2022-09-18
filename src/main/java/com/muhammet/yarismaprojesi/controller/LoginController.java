package com.muhammet.yarismaprojesi.controller;

import com.muhammet.yarismaprojesi.dto.request.DoLoginRequestDto;
import com.muhammet.yarismaprojesi.dto.request.RegisterRequestDto;
import com.muhammet.yarismaprojesi.repository.entity.User;
import com.muhammet.yarismaprojesi.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
@RequestMapping("")
@RequiredArgsConstructor
public class LoginController {

    private final UserService userService;

    @GetMapping("/login")
    public ModelAndView login(){
       return new ModelAndView("login");
    }

    @GetMapping("/register")
    public ModelAndView register(){
        return new ModelAndView("register");
    }
    // https://localhost:8080/v1/login
    // register
    // https://localhost:8080/v1/register
    // /register
    // https://localhost:8080/register
    @PostMapping("/register")
    public ModelAndView register(RegisterRequestDto dto){
        boolean isregister = userService.register(dto);
        ModelAndView model = new ModelAndView();
        if(isregister){
            model.setViewName("redirect:/login");
        }else{
            model.addObject("error",
                    "Kullanıcı adı daha önce alınmıştır");
            model.setViewName("register");
        }
        return model;
    }

    @PostMapping("/login")
    public ModelAndView login(DoLoginRequestDto doLoginRequestDto){
       Optional<User> userOptional =  userService.doLogin(doLoginRequestDto);
       ModelAndView modelAndView = new ModelAndView();
       if(userOptional.isEmpty()){
           modelAndView.addObject("error","Kullanıcı adı veya şifre hatalı");
           modelAndView.setViewName("login");
       }else{
           modelAndView.addObject("user",userOptional.get());
           modelAndView.setViewName("user");
       }
       return modelAndView;
    }
}

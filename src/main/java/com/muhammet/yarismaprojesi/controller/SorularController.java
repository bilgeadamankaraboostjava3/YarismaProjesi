package com.muhammet.yarismaprojesi.controller;

import com.muhammet.yarismaprojesi.dto.request.SoruEklemeRequestDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/sorular")
public class SorularController {

    @PostMapping("/soruekle")
    public ModelAndView soruEkleme(SoruEklemeRequestDto dto){
        return null;
    }

}

package kh.edu.beltei.e3.controller;

import kh.edu.beltei.e3.dto.RegisterDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/register")
public class RegisterController {

    @GetMapping(value = {"","/"})
    public String viewRegister(){
        return "register";
    }

    @PostMapping(value = {"","/"})
    public String submitRegister(@ModelAttribute RegisterDto registerDto){

        System.out.println("Data : " + registerDto.toString());

        return "redirect:/";
    }


}

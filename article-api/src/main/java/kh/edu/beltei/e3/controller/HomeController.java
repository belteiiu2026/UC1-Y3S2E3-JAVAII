package kh.edu.beltei.e3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList;
import java.util.List;


@Controller
public class HomeController {

    @GetMapping("/")
    String home(Model model){
        List<String> products = new ArrayList<>();
        for (int i=0; i<20; i++){
            products.add("CacaCola "+i);
        }
        model.addAttribute("products",products);
        return "index";
    }

    @GetMapping("/add-products")
    String addProduct(){
        return "add-products";
    }

    @GetMapping("/view-products")
    String viewProduct(){
        return "view-products";
    }

    @GetMapping("/login")
    String login(){
        return "login";
    }

}

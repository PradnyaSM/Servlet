package com.example.BankAss.controller;

import com.example.BankAss.services.BankServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/bank")
public class BankController2 {

    @Autowired
    BankServices service;

//    @GetMapping ("/branch")
//    public List<String> getName(){
//        return service.getServices();
//    }
//
//    @GetMapping ("/service")
//    public List<String> address(){
//        return service.getServices();
//    }

        @GetMapping ("/branch")
        public String getName(Model model){
            model.addAttribute("name","State Bank of India");
            model.addAttribute("branches",service.getBranches());
            return "branch";
    }

        @GetMapping("/service")
    public String getService(Model model){
            model.addAttribute("name","State Bank Of India");
            model.addAttribute("services",service.getServices());
            return "service";
        }

}

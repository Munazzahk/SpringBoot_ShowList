package com.example.showlist.controllers;

import com.example.showlist.models.Something;
import com.example.showlist.utils.ListCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class HomeController {
    @Autowired
    private ListCreator listCreator;

    @GetMapping("/")
    public String index(Model model) {
        ArrayList<Something> list = listCreator.getList();
        model.addAttribute("list", list);
        return "home/index";
    }
}

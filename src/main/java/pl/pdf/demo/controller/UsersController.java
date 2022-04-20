package pl.pdf.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.pdf.demo.model.Users;
import pl.pdf.demo.service.UsersService;

import java.util.List;

@Controller
public class UsersController {

    @Autowired
    UsersService service;

    @RequestMapping("/")
    public String homePage(Model model) {


        List<Users> listUsers = service.listAll();

        model.addAttribute("listUsers", listUsers);

        return "index";
    }



}

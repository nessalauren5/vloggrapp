package io.vloggrapp.controller;

import ch.qos.logback.classic.Logger;
import io.vloggrapp.dao.Vloggr;
import io.vloggrapp.security.LoginFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.annotation.WebServlet;

@RestController
public class LoginController {

    @GetMapping("/login")
    public String loginOrCreateUser(){
        return "ideas";
    }
}

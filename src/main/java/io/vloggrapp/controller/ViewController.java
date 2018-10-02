package io.vloggrapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ViewController {

    public static final Logger logger = LoggerFactory.getLogger(ViewController.class);

    @GetMapping("/")
    public String homePage() {
        logger.debug("Trying to process index page.");
        return "index";
    }

    @GetMapping("/home")
    public String homePage2(Model model) {
        logger.debug("Trying to process index page.");
        return "index";
    }

    @GetMapping("/test")
    public String test(){
        return "index";
    }
}

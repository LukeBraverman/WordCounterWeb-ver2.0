package com.pollinate.wordcounter.wordcounter.WordControllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ReturnHomeController {
    @RequestMapping(path = "/")
    public ModelAndView returnHome() {

        ModelAndView mv = new ModelAndView("home.html");
        return mv;
    }

    }


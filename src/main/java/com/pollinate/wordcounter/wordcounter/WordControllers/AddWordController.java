package com.pollinate.wordcounter.wordcounter.WordControllers;

import com.pollinate.wordcounter.wordcounter.WordObject.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class AddWordController {
    @Autowired
    private  WordService wordService;


    @PostMapping(path = "/AddWord")
    public ModelAndView addWordToDatabse(@RequestParam(value = "wordToAdd") String wordToAdd) {

        try {
            wordService.addWord(wordToAdd);

            ModelAndView mv = new ModelAndView("wordAdded");
            mv.addObject("wordAdded",wordToAdd);
            return mv;
        } catch (IllegalStateException e) {
            ModelAndView mv = new ModelAndView("ErrorPage");
            String Error = "Not a valid word. Word must only contain letters";
            mv.addObject("ErrorMessage",Error);
            return mv;
        }

    }
}

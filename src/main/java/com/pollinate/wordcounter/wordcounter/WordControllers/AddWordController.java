package com.pollinate.wordcounter.wordcounter.WordControllers;

import com.pollinate.wordcounter.wordcounter.WordObject.WordService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path = "/WordCounter")
public class AddWordController {
    private  WordService wordService;


    @PostMapping(path = "/AddWord")
    public ModelAndView addWordToDatabse(@RequestParam(value = "wordToAdd") String wordToAdd) {

        try {
            wordService.addWord(wordToAdd);

            //CREATE VIEW
        } catch (IllegalStateException e) {
            //ADD VIEWS
        }

    }
}

package com.pollinate.wordcounter.wordcounter.WordControllers;

import com.pollinate.wordcounter.wordcounter.WordObject.WordModel;
import com.pollinate.wordcounter.wordcounter.WordObject.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class FindWordController {
    @Autowired
    private WordService wordService;
    private WordModel word;
    @GetMapping("/FindWord")
    public ModelAndView findWordInDatabase(@RequestParam(value = "wordToFind") String wordToFind) {
        try{
            word = wordService.findWord(wordToFind);
            ModelAndView mv = new ModelAndView("wordFound");
            mv.addObject("wordFound",word.toString());
            return mv;
        } catch (IllegalStateException e) {
            String error = "Word not in database";
            ModelAndView mv = new ModelAndView("ErrorPage");
            mv.addObject("ErrorMessage",error);
            return mv;
        }
    }




}

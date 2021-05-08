package com.pollinate.wordcounter.wordcounter.WordControllers;

import com.pollinate.wordcounter.wordcounter.WordObject.WordModel;
import com.pollinate.wordcounter.wordcounter.WordObject.WordService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/WordCounter")
public class FindWordController {

    private WordService wordService;
    private WordModel word;
    @GetMapping("/FindWord")
    public ModelAndView findWordInDatabase(@RequestParam(value = "wordToFind") String wordToFind) {
        try{
            word = wordService.findWord(wordToFind);
        } catch (IllegalStateException e) {
            //add views
        }
    }




}

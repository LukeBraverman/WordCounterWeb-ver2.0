package com.pollinate.wordcounter.wordcounter.WordObject;

import org.springframework.stereotype.Service;

@Service
public class WordService {
    private final WordRepositry wordRepositry;


    public void addWord() {
    //TODO: ADDWORD IMPLEMENTATION
}


    public void findWord() {
        //TODO: findWORD IMPLEMENTATION
    }







    public WordService(WordRepositry wordRepositry) {
        this.wordRepositry = wordRepositry;
    }
}

package com.pollinate.wordcounter.wordcounter.WordObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WordService implements Translator {
    @Autowired
    private WordRepositry wordRepositry;
    private WordModel word;




    public void addWord(String wordToAdd) {
        //TODO: ADDWORD IMPLEMENTATION
        boolean isValid = WordCharacterChecker.isWordValid(wordToAdd);

        if (!isValid) {
            throw new IllegalStateException("Word is not valid");
        }
        Translate(wordToAdd);

        word = new WordModel(wordToAdd);

        try {
            word = wordRepositry.findById(word.getWord()).orElse(new WordModel(""));
            if (word.getWord().equals("")){
                throw new IllegalStateException("wordNotInDatabase");
            }
            int currentFrequency = word.getFrequency();
            currentFrequency ++;
            word.setFrequency(currentFrequency);
            wordRepositry.save(word);
        }catch (IllegalStateException e) {
            word.setWord(wordToAdd);
            wordRepositry.save(word);
        }




    }


    public WordModel findWord(String wordToFind) {

        word = wordRepositry.findById(wordToFind).orElse(new WordModel(""));
        if (word.getWord().equals("")){
            throw new IllegalStateException("wordNotInDatabase");
        }
        return word;





    }

    @Override
    public String Translate(String wordToTranslate) {
        return wordToTranslate;
    }
}







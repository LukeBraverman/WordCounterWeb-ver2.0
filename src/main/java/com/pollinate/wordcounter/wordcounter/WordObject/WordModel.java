package com.pollinate.wordcounter.wordcounter.WordObject;

import javax.persistence.*;

@Entity
@Table(name="word_model")
public class WordModel {
    @Id

    private String word;


    private  int frequency =1;


    public WordModel(String word) {
        this.word = word;
    }

    public WordModel() {

    }

    public String getWord() {
        return word;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public void setWord(String word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return "WordModel{" +
                "word='" + word + '\'' +
                ", frequency=" + frequency +
                '}';
    }
}

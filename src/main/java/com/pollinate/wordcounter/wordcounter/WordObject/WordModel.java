package com.pollinate.wordcounter.wordcounter.WordObject;

import javax.persistence.*;

@Entity
public class WordModel {
    @Id
    private String word;

    @SequenceGenerator(
            name = "frequency_initial_value",
            sequenceName = "frequency_initial_value",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "frequency_initial_value"
    )
    private  int frequency;


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

    @Override
    public String toString() {
        return "WordModel{" +
                "word='" + word + '\'' +
                ", frequency=" + frequency +
                '}';
    }
}

package com.pollinate.wordcounter.wordcounter.WordObject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
public class WordCharacterCheckerTest {
    @Test
    public void isInAlphabetTest_givenValidWord_thenXXXX() {
        //given
        String validWord = "Luke";

        //When
        Boolean testAnswer = WordCharacterChecker.isWordValid(validWord);

        //then
        assertTrue("Valid word is not passing word check", testAnswer);
    }

    @Test
    public void isInAlphabetTest_givenNonValidWord_thenXXXX() {
        //given
        String nonValidWord = "Luke!";

        //When
        Boolean testAnswer = WordCharacterChecker.isWordValid(nonValidWord);

        //then
        assertFalse("non Valid word is not passing word check", testAnswer);
    }

    @Test
    public void isInAlphabetTest_givenNonValidWord2_thenXXXX() {
        //given
        String nonValidWord = "";

        //When
        Boolean testAnswer = WordCharacterChecker.isWordValid(nonValidWord);

        //then
        assertFalse("non Valid word is not passing word check", testAnswer);
    }

    @Test
    public void isInAlphabetTest_givenNonValidWord3_thenXXXX() {
        //given
        String nonValidWord = "12345";

        //When
        Boolean testAnswer = WordCharacterChecker.isWordValid(nonValidWord);

        //then
        assertFalse("non Valid word is not passing word check", testAnswer);
    }

    @Test
    public void isInAlphabetTest_givenNonValidWord4_thenXXXX() {
        //given
        String nonValidWord = "!?<>;:''";

        //When
        Boolean testAnswer = WordCharacterChecker.isWordValid(nonValidWord);

        //then
        assertFalse("non Valid word is not passing word check", testAnswer);
    }

}
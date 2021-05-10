package com.pollinate.wordcounter.wordcounter.WordObject;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@RunWith(SpringRunner.class)
@ComponentScan(basePackages = {"com.pollinate.wordcounter.wordcounter"})
public class WordServiceTest {
    @Mock
    WordRepositry wordRepositry;

    WordModel dummyWord;

    @InjectMocks
    WordService wordServiceTest;

    @Before
    public void setUp() throws Exception {
        dummyWord = new WordModel();
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void addWord_whenGivenWordInDatabase_thenXXXX() {
        //given
        String wordInDatabase = "Luke";
        dummyWord.setWord(wordInDatabase);


        //when
        Mockito.when(wordRepositry.findById( anyString() ) ).thenReturn(java.util.Optional.of(dummyWord));
        Mockito.when(wordRepositry.save( dummyWord) ).thenReturn(dummyWord);

        wordServiceTest.addWord(wordInDatabase);



        //then
        verify(wordRepositry,times(1)).findById(anyString());
        verify(wordRepositry,times(1)).save(dummyWord);
    }

    @Test
    public void addWord_whenGivenWordNotInDatabase_thenXXXX() {
        //given
        String wordNotInDatabase = "LukeNotInDatabase";
        dummyWord.setWord(wordNotInDatabase);


        //when
        Mockito.doThrow(IllegalStateException.class).when(wordRepositry).findById(anyString());

        //Mockito.when(wordRepositry.save( dummyWord) ).thenReturn(dummyWord);

        wordServiceTest.addWord(wordNotInDatabase);



        //then
        verify(wordRepositry,times(1)).findById(anyString());
        //verify(wordRepositry,times(1)).save(dummyWord);
    }




    @Test
    public void findWord_whenGivenWordInDatabase_thenXXXX() {
        //given
        String wordInDatabase = "Luke";
        dummyWord.setWord(wordInDatabase);
        //when
        Mockito.when(wordRepositry.findById( anyString() ) ).thenReturn(java.util.Optional.of(dummyWord));


        //then
        assertEquals("When given word in database, should return 'WordModel' with name set to it.",dummyWord,wordServiceTest.findWord(wordInDatabase));

    }

/*
    @Test
    public void findWord_whenGivenWordNotInDatabase_thenXXXX() {
        //given
        String wordNotInDatabase = "LukeNotInDatabase";
        dummyWord.setWord(wordNotInDatabase);
        //when
        Mockito.doThrow(IllegalStateException.class).when(wordRepositry).findById(wordNotInDatabase);
        wordServiceTest.findWord(wordNotInDatabase);


        //then
        verify(wordRepositry,times(1)).findById(anyString());

    } */

}
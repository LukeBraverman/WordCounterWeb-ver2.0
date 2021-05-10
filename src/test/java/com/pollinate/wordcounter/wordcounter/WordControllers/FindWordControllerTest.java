package com.pollinate.wordcounter.wordcounter.WordControllers;

import com.pollinate.wordcounter.wordcounter.WordObject.WordModel;
import com.pollinate.wordcounter.wordcounter.WordObject.WordService;
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

@ComponentScan(basePackages = {"com.pollinate.wordcounter.wordcounter"})

@RunWith(SpringRunner.class)
public class FindWordControllerTest {
    @Mock
    WordService wordService;
    WordModel dummyWord;
    @InjectMocks
    FindWordController findWordControllerTest;

    @Before
    public void setUp() throws Exception {
        dummyWord = new WordModel();
        MockitoAnnotations.initMocks(this);
    }
    
    @Test
    public void findWordInDatabase_whenGivenWordInDatabase_thenXXXX() {
        //given
        String wordToPass = "Luke";
        dummyWord.setWord(wordToPass);
        //when

        Mockito.when(wordService.findWord( anyString() ) ).thenReturn(dummyWord);
        findWordControllerTest.findWordInDatabase(wordToPass);


        //then
        verify(wordService,times(1)).findWord(anyString());

    }

    @Test
    public void findWordInDatabase_whenGivenWordNotInDatabase_thenXXXX() {
        //given
        String wordToPass = "Luke!";

        //when
        Mockito.doThrow(IllegalStateException.class).when(wordService).findWord(wordToPass);
        findWordControllerTest.findWordInDatabase(wordToPass);


        //then
        verify(wordService,times(1)).findWord(anyString());

    }


}
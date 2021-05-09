package com.pollinate.wordcounter.wordcounter.WordControllers;

import com.pollinate.wordcounter.wordcounter.WordObject.WordModel;
import com.pollinate.wordcounter.wordcounter.WordObject.WordRepositry;
import com.pollinate.wordcounter.wordcounter.WordObject.WordService;
import org.junit.Before;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
@ComponentScan(basePackages = {"com.pollinate.wordcounter.wordcounter"})

@RunWith(SpringRunner.class)

public class AddWordControllerTest {


    @Mock
    WordService wordService;
    WordModel dummyWord;
    @InjectMocks
    AddWordController addWordControllerTest;

    @BeforeEach
    public void setUp() throws Exception {
        dummyWord = new WordModel();
        wordService = new WordService();
        addWordControllerTest = new AddWordController();
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void AddWordControllerTest_GivenValidWord_ThenXXXX() {
        //given

        String wordToPass = "Luke";


        //when
        Mockito.doNothing().when(wordService).addWord(wordToPass);
        addWordControllerTest.addWordToDatabse(wordToPass);

        //then
        verify(wordService,times(1)).addWord(anyString());




    }


}
package com.pollinate.wordcounter.wordcounter.WordObject;

import org.springframework.data.jpa.repository.JpaRepository;

public interface WordRepositry extends JpaRepository<WordModel, String> {
}

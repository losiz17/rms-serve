package io.intern.rms.services;

import io.intern.rms.domain.Word2s;
import io.intern.rms.repositories.WordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WordService {
    @Autowired
    private WordRepository wordRepository;

    public Iterable<Word2s> findAllWord(String word){
        return wordRepository.findAllByWord(word);
    }
}

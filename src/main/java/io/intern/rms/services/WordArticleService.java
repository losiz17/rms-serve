package io.intern.rms.services;


import io.intern.rms.domain.Word2s;
import io.intern.rms.domain.WordArticle2s;
import io.intern.rms.repositories.WordArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WordArticleService {
    @Autowired
    WordArticleRepository wordArticleRepository;

//    public Iterable<WordArticle2s> findAllArticleIdByWord(String word) {
//        return wordArticleRepository.findAllByWordLikeOrderByTfIdfDesc(word);
//    }

    public Iterable<WordArticle2s> findAllWordArticle2sByArticleID(Integer articleId) {
        return wordArticleRepository.findAllByArticleIdOrderByTfIdfDesc(articleId);
    }
}

package io.intern.rms.web;

import io.intern.rms.domain.Articles;
import io.intern.rms.domain.Word2s;
import io.intern.rms.domain.WordArticle2s;
import io.intern.rms.repositories.WordArticleRepository;
import io.intern.rms.services.ArticleService;
import io.intern.rms.services.WordArticleService;
import io.intern.rms.services.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.io.UnsupportedEncodingException;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/tags")
public class WordController {

    @Autowired
    private WordService wordService;

    @Autowired
    private ArticleService articleService;

    @Autowired
    private WordArticleService wordArticleService;

    @Autowired
    private WordArticleRepository wordArticleRepository;

    @PostMapping("/search")
    public Iterable<Word2s> createWordList(@RequestBody Word2s word2s){
        return wordService.findAllWord(word2s.getWord());
    }

    @PostMapping("/articles")
    public Iterable<Optional<Articles>> getArticles(@RequestBody Word2s word2s) {
        Iterable<WordArticle2s> articleIds = wordArticleRepository.findAllByWordLikeOrderByTfIdfDesc(word2s.getWord());
        return articleService.findAllArticles(articleIds);
    }

    @GetMapping("/{article_id}")
    public Iterable<WordArticle2s> getWordArticleList(@PathVariable String article_id){
        int id = Integer.parseInt(article_id);
        return wordArticleService.findAllWordArticle2sByArticleID(id);
    }

}

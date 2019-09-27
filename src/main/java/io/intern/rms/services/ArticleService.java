package io.intern.rms.services;

import io.intern.rms.domain.Articles;
import io.intern.rms.domain.Word2s;
import io.intern.rms.domain.WordArticle2s;
import io.intern.rms.repositories.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ArticleService {
    @Autowired
    ArticleRepository articleRepository;

    public Iterable<Optional<Articles>> findAllArticles(Iterable<WordArticle2s> articleIds){
        ArrayList<Optional<Articles>> list = new ArrayList<>();
        for (WordArticle2s e : articleIds) {
            Integer id = e.getArticleId();
            Optional<Articles> article = articleRepository.findById((long)id);
            list.add(article);
        }
        return list;
    }

}

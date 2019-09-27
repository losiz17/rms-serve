package io.intern.rms.repositories;

import io.intern.rms.domain.WordArticle2s;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WordArticleRepository extends JpaRepository<WordArticle2s, Long> {
    Iterable<WordArticle2s> findAllByWordLikeOrderByTfIdfDesc(String word);
    Iterable<WordArticle2s> findAllByArticleIdOrderByTfIdfDesc(Integer articleId);
}

package io.intern.rms.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class WordArticle2s {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String word;

    private Integer count;

    private Integer articleId;

    private Float tfIdf;

    private Integer idf;

    private Integer wordId;

    public WordArticle2s() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticle_id(Integer articleId) {
        this.articleId = articleId;
    }

    public Float getTf_idf() {
        return tfIdf;
    }

    public void setTf_idf(Float tf_idf) {
        this.tfIdf = tfIdf;
    }

    public Integer getIdf() {
        return idf;
    }

    public void setIdf(Integer idf) {
        this.idf = idf;
    }

    public Integer getWord_id() {
        return wordId;
    }

    public void setWord_id(Integer word_id) {
        this.wordId = wordId;
    }
}
